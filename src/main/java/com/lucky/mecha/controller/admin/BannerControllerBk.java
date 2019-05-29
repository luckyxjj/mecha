package com.lucky.mecha.controller.admin;

import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BannerService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.BannerRequest;
import com.lucky.mecha.vo.response.BannerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@RestController
@RequestMapping("/bannerBk")
public class BannerControllerBk {
    private final BannerService bannerService;

    public BannerControllerBk(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @GetMapping("/getAll")
    public Pager<Banner> getAll(Pager pager) {
        return bannerService.findAllBk(pager);
    }
}
