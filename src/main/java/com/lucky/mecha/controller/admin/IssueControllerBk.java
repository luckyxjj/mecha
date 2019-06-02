package com.lucky.mecha.controller.admin;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.entity.Issue;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.IssueService;
import com.lucky.mecha.utils.FileUtil;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.IssueResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:49
 * Description:
 */
@RestController
@RequestMapping("/issueBk")
@Slf4j
public class IssueControllerBk {
    private final IssueService issueService;

    public IssueControllerBk(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/getAll")
    public Pager<Issue> getAll(Pager pager) {
        return issueService.findAllBk(pager);
    }

    @PostMapping("/delete")
    public String delete(Long id) throws MechaException {
        return issueService.delete(id);
    }

    @PostMapping("/update")
    public IssueResponse update(Issue request) throws MechaException {
        return issueService.update(request);
    }
}
