package com.lucky.mecha.controller;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CategoryService;
import com.lucky.mecha.vo.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    public List<CategoryResponse> getAll() throws MechaException {
        return categoryService.findAll();
    }
}
