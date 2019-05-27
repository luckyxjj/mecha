package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.AboutRepository;
import com.lucky.mecha.dao.BannerRepository;
import com.lucky.mecha.entity.About;
import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AboutService;
import com.lucky.mecha.service.BannerService;
import com.lucky.mecha.vo.request.BannerRequest;
import com.lucky.mecha.vo.response.AboutResponse;
import com.lucky.mecha.vo.response.BannerResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:22
 * Description:
 */
@Service
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;

    public BannerServiceImpl(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    @Override
    public List<BannerResponse> findByType(BannerRequest request) throws MechaException {
        if (!request.validate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        List<Banner> banners = bannerRepository.findAllByTypeAndDeleteFlag(request.getType(),1);
        ArrayList<BannerResponse> bannerResponses = new ArrayList<>();
        if (banners.size()>0){
            banners.stream().forEach(v->{
                BannerResponse bannerResponse = new BannerResponse();
                BeanUtils.copyProperties(v,bannerResponse);
                bannerResponses.add(bannerResponse);
            });
        }
        return bannerResponses;
    }
}
