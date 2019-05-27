package com.lucky.mecha.controller;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.IssueService;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.IssueResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:49
 * Description:
 */
@RestController
@RequestMapping("/issue")
@Slf4j
public class IssueController {
    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @PostMapping("/submit")
    public IssueResponse submit(@RequestBody IssueRequest request) throws MechaException {
        log.info("issue/submit -> {}",JSON.toJSONString(request));
        return issueService.submit(request);
    }
}
