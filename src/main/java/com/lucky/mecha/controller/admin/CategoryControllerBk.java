package com.lucky.mecha.controller.admin;

import com.lucky.mecha.entity.Category;
import com.lucky.mecha.entity.Counseling;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CategoryService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.response.CategoryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:02
 * Description:
 */
@RestController
@RequestMapping("/categoryBk")
public class CategoryControllerBk {
    private final CategoryService categoryService;

    public CategoryControllerBk(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    public Pager<Category> getAll(Pager pager) {
        return categoryService.findAllBk(pager);
    }

    @PostMapping("/add")
    public Category add(Category request) throws MechaException{
        return categoryService.add(request);
    }

    @PostMapping("/update")
    public Category update(Category request) throws MechaException{
        return categoryService.update(request);
    }

    @PostMapping("/delete")
    public String delete(Long id) {
        return categoryService.delete(id);
    }
}
