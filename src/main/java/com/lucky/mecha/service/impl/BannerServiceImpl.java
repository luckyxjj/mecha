package com.lucky.mecha.service.impl;

import com.github.pagehelper.PageInfo;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.AboutRepository;
import com.lucky.mecha.dao.BannerRepository;
import com.lucky.mecha.entity.About;
import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AboutService;
import com.lucky.mecha.service.BannerService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.BannerRequest;
import com.lucky.mecha.vo.response.AboutResponse;
import com.lucky.mecha.vo.response.BannerResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Pager<Banner> findAllBk(Pager pager) {
        List<Banner> banners = bannerRepository.findAll();
        if (banners.size()>0){
            PageInfo<Banner> info = new PageInfo<>(banners);
            pager.setRows(info.getList());
            pager.setTotal((int)info.getTotal());
        }else {
            pager.setRows(banners);
            pager.setTotal(0);
        }
        return pager;
    }

    @Override
    public BannerResponse updateBk(Banner request) {
        Optional<Banner> bannerOptional = bannerRepository.findById(request.getId());
        Banner oldBanner = bannerOptional.get();
        String[] ignore = new String[2];
        if (StringUtils.isEmpty(request.getUrlCn())){
            ignore[0]="urlCn";
        }
        if (StringUtils.isEmpty(request.getUrlEn())){
            ignore[1]="urlEn";
        }
        BeanUtils.copyProperties(request,oldBanner,ignore);
        Banner banner = bannerRepository.save(oldBanner);
        BannerResponse bannerResponse = new BannerResponse();
        BeanUtils.copyProperties(banner,bannerResponse);
        return bannerResponse;
    }

    @Override
    public BannerResponse addBk(Banner request) {
        Banner banner = new Banner();
        BeanUtils.copyProperties(request,banner);
        Banner result = bannerRepository.save(banner);
        BannerResponse bannerResponse = new BannerResponse();
        BeanUtils.copyProperties(result,bannerResponse);
        return bannerResponse;
    }

    @Override
    public String delete(Long id) {
        bannerRepository.deleteById(id);
        return "yes";
    }
}
