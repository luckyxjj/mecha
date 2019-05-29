package com.lucky.mecha.controller;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.IssueService;
import com.lucky.mecha.utils.FileUtil;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.IssueResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
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
@RequestMapping("/issue")
@Slf4j
public class IssueController {
    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @PostMapping("/submit")
    public IssueResponse submit(IssueRequest request, MultipartFile[] file, HttpServletRequest servletRequest) throws MechaException {
        log.info("issue/submit -> {}",JSON.toJSONString(request));
        request.setSex(request.getSex()==null?0:request.getSex());
        if (!request.validate()){
            throw new MechaException(Constants.ErrorMsg.ISSUE_PARA_ERROR);
        }

        String realPath = servletRequest.getSession().getServletContext().getRealPath("/");
        if(file!=null&&file.length>0) {
            try {
                String saveUrl = FileUtil.uploadFiles(file, realPath);
                request.setImgUrl(saveUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return issueService.submit(request);
    }
}
