package com.lucky.mecha.service;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.request.BuyingRequest;
import com.lucky.mecha.vo.response.BuyingResponse;

public interface BuyingService {
    BuyingResponse submit(BuyingRequest request) throws MechaException;
}
