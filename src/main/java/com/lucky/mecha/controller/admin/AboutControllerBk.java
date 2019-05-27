package com.lucky.mecha.controller.admin;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.entity.About;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AboutService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.AboutRequest;
import com.lucky.mecha.vo.response.AboutResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@RestController
@RequestMapping("/aboutBk")
@Slf4j
public class AboutControllerBk {
    private final AboutService aboutService;

    public AboutControllerBk(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/getAll")
    public Pager<About> getAll(Pager pager) {
        return aboutService.findAllBk(pager);
    }

    @PostMapping("/update")
    public About update(AboutRequest request) throws MechaException {
        log.info("aboutBk/update -> {}", JSON.toJSONString(request));
        return aboutService.updateBk(request);
    }
}
