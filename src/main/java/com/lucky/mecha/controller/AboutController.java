package com.lucky.mecha.controller;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AboutService;
import com.lucky.mecha.vo.request.AboutRequest;
import com.lucky.mecha.vo.response.AboutResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@RestController
@RequestMapping("/about")
public class AboutController {
    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/getLastOne")
    public AboutResponse getLastOne(AboutRequest request) throws MechaException {
        return aboutService.findLastOne(request);
    }
}
