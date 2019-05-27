package com.lucky.mecha.controller.admin;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.entity.About;
import com.lucky.mecha.entity.Counseling;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CounselingService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.AboutRequest;
import com.lucky.mecha.vo.request.CounselingRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 14:12
 * Description:
 */
@Slf4j
@RestController
@RequestMapping("/counselingBk")
public class CounselingControllerBk {
    private final CounselingService counselingService;

    public CounselingControllerBk(CounselingService counselingService) {
        this.counselingService = counselingService;
    }

    @GetMapping("/getAll")
    public Pager<Counseling> getAll(Pager pager) {
        return counselingService.findAllBk(pager);
    }

    @PostMapping("/update")
    public Counseling update(CounselingRequest request) throws MechaException {
        log.info("counselingBk/update -> {}", JSON.toJSONString(request));
        return counselingService.updateBk(request);
    }
}
