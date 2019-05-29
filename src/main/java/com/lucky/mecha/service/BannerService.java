package com.lucky.mecha.service;

import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.BannerRequest;
import com.lucky.mecha.vo.response.BannerResponse;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 14:52
 * Description:
 */
public interface BannerService {
    List<BannerResponse> findByType(BannerRequest request) throws MechaException;

    Pager<Banner> findAllBk(Pager pager);

    BannerResponse updateBk(Banner request);

    BannerResponse addBk(Banner request);

    String delete(Long id);
}
