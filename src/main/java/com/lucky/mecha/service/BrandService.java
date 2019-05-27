package com.lucky.mecha.service;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.response.BrandResponse;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:08
 * Description:
 */
public interface BrandService {
    List<BrandResponse> findAll() throws MechaException;
}
