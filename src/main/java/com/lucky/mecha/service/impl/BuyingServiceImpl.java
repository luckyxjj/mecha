package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.BuyingRepository;
import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BuyingService;
import com.lucky.mecha.vo.request.BuyingRequest;
import com.lucky.mecha.vo.response.BuyingResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

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
}
