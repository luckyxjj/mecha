package com.lucky.mecha.service;

import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.BuyingRequest;
import com.lucky.mecha.vo.response.BuyingResponse;

public interface BuyingService {
    BuyingResponse submit(BuyingRequest request) throws MechaException;

    Pager<Buying> findAllBk(Pager pager);

    String delete(Long id) throws MechaException;

    BuyingResponse update(Buying request) throws MechaException;
}
