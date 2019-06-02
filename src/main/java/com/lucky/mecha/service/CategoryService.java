package com.lucky.mecha.service;

import com.lucky.mecha.entity.Category;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> findAll() throws MechaException;

    Pager<Category> findAllBk(Pager pager);

    Category add(Category request) throws MechaException;

    Category update(Category request) throws MechaException;

    String delete(Long id);
}
