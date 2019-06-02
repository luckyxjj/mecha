package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.BuyingRepository;
import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BuyingService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.BuyingRequest;
import com.lucky.mecha.vo.response.BuyingResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 11:33
 * Description:
 */
@Service
public class BuyingServiceImpl implements BuyingService {
    private final BuyingRepository buyingRepository;

    public BuyingServiceImpl(BuyingRepository buyingRepository) {
        this.buyingRepository = buyingRepository;
    }

    @Override
    public BuyingResponse submit(BuyingRequest request) throws MechaException {
        if (!request.validate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Buying buying = new Buying();
        buying.setContact(request.getContact());
        Buying save = buyingRepository.save(buying);
        return new BuyingResponse(save.getId(),save.getContact());
    }

    @Override
    public Pager<Buying> findAllBk(Pager pager) {
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        PageRequest pageRequest = PageRequest.of(pager.getOffset()/pager.getLimit(), pager.getLimit(),sort);
        Page<Buying> buyingPage = null;
        if (!StringUtils.isEmpty(pager.getCondition())){
            buyingPage = buyingRepository.findByDeleteFlagAndContactLike(1,pager.getCondition()+"%",pageRequest);
        }else {
            buyingPage = buyingRepository.findAllByDeleteFlag(1,pageRequest);
        }
        pager.setRows(buyingPage.getContent());
        pager.setTotal((int)buyingPage.getTotalElements());
        return pager;
    }

    @Override
    public String delete(Long id) throws MechaException{
        Optional<Buying> buyingOptional = buyingRepository.findById(id);
        if (!buyingOptional.isPresent()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Buying buying = buyingOptional.get();
        buying.setDeleteFlag(0);
        buyingRepository.save(buying);
        return "ok";
    }

    @Override
    public BuyingResponse update(Buying request) throws MechaException {
        if (null==request.getId()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Optional<Buying> buyingOptional = buyingRepository.findById(request.getId());
        if (!buyingOptional.isPresent()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Buying buying = buyingOptional.get();
        buying.setFlag(request.getFlag());
        buyingRepository.save(buying);
        return new BuyingResponse();
    }
}
