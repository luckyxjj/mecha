package com.lucky.mecha.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BannerService;
import com.lucky.mecha.utils.FileUtil;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.response.BannerResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
        if (file != null && file.length > 0) {
            try {
                String saveUrl = FileUtil.uploadFiles(file, realPath);
                String[] imgPath = saveUrl.split(",");
                request.setUrlCn(imgPath[0]);
                if (imgPath.length>1){
                    request.setUrlEn(imgPath[1]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bannerService.updateBk(request);
    }

    @PostMapping("/add")
    public BannerResponse add(Banner request, MultipartFile[] file, HttpServletRequest servletRequest) throws MechaException {
        log.info("issue/submit -> {}", JSON.toJSONString(request));
        if (null == file || file.length < 2) {
            throw new MechaException(Constants.ErrorMsg.IMPERFECTION_IMG);
        }
        String realPath = servletRequest.getSession().getServletContext().getRealPath("/");
        if (file != null && file.length > 0) {
            try {
                String saveUrl = FileUtil.uploadFiles(file, realPath);
                String[] imgPath = saveUrl.split(",");
                request.setUrlCn(imgPath[0]);
                if (imgPath.length>1){
                    request.setUrlEn(imgPath[1]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bannerService.addBk(request);
    }

    @PostMapping("/delete")
    public String delete(Long id) {
        return bannerService.delete(id);
    }

    @PostMapping("/imageUpload")
    public JSONObject imageUpload(MultipartHttpServletRequest request) throws Exception {
        String webpath = null;
        JSONObject json = new JSONObject();
        try {
            //上传图片
            MultipartFile file = request.getFile("imgFile");
            String realPath = request.getSession().getServletContext().getRealPath("/");
            webpath = FileUtil.addFile(file,realPath);
            if (StringUtils.isNotEmpty(webpath)) {
                String path = request.getContextPath();
                String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
                json.put("error",0);
                json.put("url",basePath + webpath);
            } else {
                json.put("error",0);
                json.put("message","上传文件不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
