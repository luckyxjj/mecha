package com.lucky.mecha.service.impl;

import com.lucky.mecha.dao.CategoryRepository;
import com.lucky.mecha.entity.Category;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CategoryService;
import com.lucky.mecha.vo.response.CategoryResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 16:54
 * Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryResponse> findAll() throws MechaException {
        List<Category> categories = categoryRepository.findAllByDeleteFlag(1);
        ArrayList<CategoryResponse> categoryResponses = new ArrayList<>();
        if (categories.size()>0){
            categories.stream().forEach(v->{
                CategoryResponse categoryResponse = new CategoryResponse();
                BeanUtils.copyProperties(v,categoryResponse);
                categoryResponses.add(categoryResponse);
            });
        }
        return categoryResponses;
    }
}
