package com.lucky.mecha.service.impl;

import com.github.pagehelper.PageInfo;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.AboutRepository;
import com.lucky.mecha.entity.About;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AboutService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.AboutRequest;
import com.lucky.mecha.vo.response.AboutResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:22
 * Description:
 */
@Service
public class AboutServiceImpl implements AboutService {
    private final AboutRepository aboutRepository;

    public AboutServiceImpl(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    @Override
    public AboutResponse findLastOne(AboutRequest request) throws MechaException {
        if (!request.getValidate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        About about = aboutRepository.findByTypeAndDeleteFlag(request.getType(),1);
        AboutResponse aboutResponse = new AboutResponse();
        if (about==null){
            return null;
        }
        BeanUtils.copyProperties(about,aboutResponse);
        return aboutResponse;
    }

    @Override
    public Pager<About> findAllBk(Pager pager) {
        List<About> abouts = aboutRepository.findAll();
        if (abouts.size()>0){
            PageInfo<About> info = new PageInfo<>(abouts);
            pager.setRows(info.getList());
            pager.setTotal((int)info.getTotal());
        }else {
            pager.setRows(abouts);
            pager.setTotal(0);
        }
        return pager;
    }

    @Override
    public About updateBk(AboutRequest request) throws MechaException {
        if (!request.updateValidate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        About about = new About();
        BeanUtils.copyProperties(request,about);
        return aboutRepository.save(about);
    }
}
