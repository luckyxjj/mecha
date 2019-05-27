package com.lucky.mecha.service.impl;

import com.lucky.mecha.dao.BrandRepository;
import com.lucky.mecha.entity.Brand;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BrandService;
import com.lucky.mecha.vo.response.BrandResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:09
 * Description:
 */
@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandResponse> findAll() throws MechaException {
        List<Brand> brands = brandRepository.findAllByDeleteFlag(1);
        ArrayList<BrandResponse> brandResponses = new ArrayList<>();
        if (brands.size()>0){
            brands.stream().forEach(v->{
                BrandResponse brandResponse = new BrandResponse();
                BeanUtils.copyProperties(v,brandResponse);
                brandResponses.add(brandResponse);
            });
        }
        return brandResponses;
    }
}
