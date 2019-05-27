package com.lucky.mecha.controller;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CounselingService;
import com.lucky.mecha.vo.request.AboutRequest;
import com.lucky.mecha.vo.request.CounselingRequest;
import com.lucky.mecha.vo.response.CounselingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 14:12
 * Description:
 */
@RestController
@RequestMapping("/counseling")
public class CounselingController {
    private final CounselingService counselingService;

    public CounselingController(CounselingService counselingService) {
        this.counselingService = counselingService;
    }

    @GetMapping("/getLastOne")
    public CounselingResponse getLastOne(CounselingRequest request) throws MechaException {
        return counselingService.findLastOne(request);
    }
}
