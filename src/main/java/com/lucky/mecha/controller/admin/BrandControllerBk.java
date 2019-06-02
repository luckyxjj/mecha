package com.lucky.mecha.controller.admin;

import com.lucky.mecha.entity.Brand;
import com.lucky.mecha.entity.Category;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BrandService;
import com.lucky.mecha.service.CategoryService;
import com.lucky.mecha.vo.Pager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:02
 * Description:
 */
@RestController
@RequestMapping("/brandBk")
public class BrandControllerBk {
    private final BrandService brandService;

    public BrandControllerBk(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public Pager<Brand> getAll(Pager pager) {
        return brandService.findAllBk(pager);
    }

    @PostMapping("/add")
    public Brand add(Brand request) throws MechaException{
        return brandService.add(request);
    }

    @PostMapping("/update")
    public Brand update(Brand request) throws MechaException{
        return brandService.update(request);
    }

    @PostMapping("/delete")
    public String delete(Long id) {
        return brandService.delete(id);
    }
}
