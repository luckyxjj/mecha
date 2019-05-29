package com.lucky.mecha.controller.admin;

import com.alibaba.fastjson.JSON;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BannerService;
import com.lucky.mecha.utils.FileUtil;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.BannerRequest;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.BannerResponse;
import com.lucky.mecha.vo.response.IssueResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@Slf4j
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

    @PostMapping("/update")
    public BannerResponse update(Banner request, MultipartFile[] file, HttpServletRequest servletRequest) throws MechaException {
        log.info("issue/submit -> {}", JSON.toJSONString(request));

        String realPath = servletRequest.getSession().getServletContext().getRealPath("/");
        if(file!=null&&file.length>0) {
            try {
                String saveUrl = FileUtil.uploadFiles(file, realPath);
                String[] imgPath = saveUrl.split(",");
                request.setUrlCn(imgPath[0]);
                request.setUrlEn(imgPath[1]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bannerService.updateBk(request);
    }

    @PostMapping("/add")
    public BannerResponse add(Banner request, MultipartFile[] file, HttpServletRequest servletRequest) throws MechaException {
        log.info("issue/submit -> {}", JSON.toJSONString(request));
        if (null==file||file.length<2){
            throw new MechaException(Constants.ErrorMsg.IMPERFECTION_IMG);
        }
        String realPath = servletRequest.getSession().getServletContext().getRealPath("/");
        if(file!=null&&file.length>0) {
            try {
                String saveUrl = FileUtil.uploadFiles(file, realPath);
                String[] imgPath = saveUrl.split(",");
                request.setUrlCn(imgPath[0]);
                request.setUrlEn(imgPath[1]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bannerService.addBk(request);
    }

    @PostMapping("/delete")
    public String delete(Long id){
        return bannerService.delete(id);
    }
}
