package com.lucky.mecha.controller;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BannerService;
import com.lucky.mecha.vo.request.BannerRequest;
import com.lucky.mecha.vo.response.BannerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@RestController
@RequestMapping("/banner")
public class BannerController {
    private final BannerService bannerService;

    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @GetMapping("/getByType")
    public List<BannerResponse> getByType(BannerRequest request) throws MechaException {
        return bannerService.findByType(request);
    }
}
