package com.lucky.mecha.service;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> findAll() throws MechaException;
}
