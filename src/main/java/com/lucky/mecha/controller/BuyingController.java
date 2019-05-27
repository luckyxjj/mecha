package com.lucky.mecha.controller;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.entity.About;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BuyingService;
import com.lucky.mecha.utils.IPUtils;
import com.lucky.mecha.vo.request.BuyingRequest;
import com.lucky.mecha.vo.response.BuyingResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@Slf4j
@RestController
@RequestMapping("/buying")
public class BuyingController {
    private final BuyingService buyingService;

    public BuyingController(BuyingService buyingService) {
        this.buyingService = buyingService;
    }

    @PostMapping("/submit")
    public BuyingResponse getLastOne(BuyingRequest request, HttpServletRequest servletRequest) throws MechaException {
        System.out.println("访问者IP："+servletRequest.getRemoteAddr());
        String ip = IPUtils.getIP(servletRequest);
        System.out.println("获取的IP："+ip);
        log.info("/buying/submit -> {}", JSON.toJSONString(request));
        return buyingService.submit(request);
    }
}
