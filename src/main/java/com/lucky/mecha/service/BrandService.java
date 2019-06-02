package com.lucky.mecha.service;

import com.lucky.mecha.entity.Brand;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
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

    Pager<Brand> findAllBk(Pager pager);

    Brand add(Brand request) throws MechaException;

    Brand update(Brand request) throws MechaException;

    String delete(Long id);
}
