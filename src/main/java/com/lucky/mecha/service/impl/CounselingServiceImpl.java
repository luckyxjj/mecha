package com.lucky.mecha.service.impl;

import com.github.pagehelper.PageInfo;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.CounselingRepository;
import com.lucky.mecha.entity.Counseling;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CounselingService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.CounselingRequest;
import com.lucky.mecha.vo.response.CounselingResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 14:08
 * Description:
 */
@Service
public class CounselingServiceImpl implements CounselingService {
    private final CounselingRepository counselingRepository;

    public CounselingServiceImpl(CounselingRepository counselingRepository) {
        this.counselingRepository = counselingRepository;
    }

    @Override
    public CounselingResponse findLastOne(CounselingRequest request) throws MechaException {
        if (!request.getValidate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Counseling counseling = counselingRepository.findByTypeAndDeleteFlag(request.getType(),1);
        CounselingResponse counselingResponse = new CounselingResponse();
        if (counseling==null){
            return null;
        }
        BeanUtils.copyProperties(counseling,counselingResponse);
        return counselingResponse;
    }

    @Override
    public Pager<Counseling> findAllBk(Pager pager) {
        List<Counseling> counselings = counselingRepository.findAll();
        if (counselings.size()>0){
            PageInfo<Counseling> info = new PageInfo<>(counselings);
            pager.setRows(info.getList());
            pager.setTotal((int)info.getTotal());
        }else {
            pager.setRows(counselings);
            pager.setTotal(0);
        }
        return pager;
    }

    @Override
    public Counseling updateBk(CounselingRequest request) throws MechaException {
        if (!request.updateValidate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Counseling counseling = new Counseling();
        BeanUtils.copyProperties(request,counseling);
        return counselingRepository.save(counseling);
    }
}
