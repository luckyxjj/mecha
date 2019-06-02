package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.BrandRepository;
import com.lucky.mecha.entity.Brand;
import com.lucky.mecha.entity.Category;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BrandService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.response.BrandResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Pager<Brand> findAllBk(Pager pager) {
        PageRequest pageRequest = PageRequest.of(pager.getOffset()/pager.getLimit(), pager.getLimit());
        Page<Brand> brandPage = brandRepository.findAll(pageRequest);
        pager.setRows(brandPage.getContent());
        pager.setTotal((int)brandPage.getTotalElements());
        return pager;
    }

    @Override
    public Brand add(Brand request) throws MechaException {
        if (StringUtils.isEmpty(request.getNameCn())||StringUtils.isEmpty(request.getNameEn())){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        return brandRepository.save(request);
    }

    @Override
    public Brand update(Brand request) throws MechaException {
        Optional<Brand> brandOptional = brandRepository.findById(request.getId());
        if (!brandOptional.isPresent()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Brand brand = brandOptional.get();
        brand.setDeleteFlag(request.getDeleteFlag());
        brand.setNameCn(request.getNameCn());
        brand.setNameEn(request.getNameEn());
        return brandRepository.save(brand);
    }

    @Override
    public String delete(Long id) {
        brandRepository.deleteById(id);
        return "yes";
    }
}
