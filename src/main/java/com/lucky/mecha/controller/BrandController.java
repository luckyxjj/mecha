package com.lucky.mecha.controller;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BrandService;
import com.lucky.mecha.vo.response.BrandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:13
 * Description:
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<BrandResponse> getAll() throws MechaException {
        return brandService.findAll();
    }

}
