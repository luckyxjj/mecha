package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.CategoryRepository;
import com.lucky.mecha.entity.Banner;
import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.entity.Category;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.CategoryService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.response.CategoryResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Pager<Category> findAllBk(Pager pager) {
        PageRequest pageRequest = PageRequest.of(pager.getOffset()/pager.getLimit(), pager.getLimit());
        Page<Category> categoryPage = categoryRepository.findAll(pageRequest);
        pager.setRows(categoryPage.getContent());
        pager.setTotal((int)categoryPage.getTotalElements());
        return pager;
    }

    @Override
    public Category add(Category request) throws MechaException {
        if (StringUtils.isEmpty(request.getNameCn())||StringUtils.isEmpty(request.getNameEn())){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        return categoryRepository.save(request);
    }

    @Override
    public Category update(Category request) throws MechaException {
        Optional<Category> categoryOptional = categoryRepository.findById(request.getId());
        if (!categoryOptional.isPresent()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Category category = categoryOptional.get();
        category.setDeleteFlag(request.getDeleteFlag());
        category.setNameCn(request.getNameCn());
        category.setNameEn(request.getNameEn());
        return categoryRepository.save(category);
    }

    @Override
    public String delete(Long id) {
        categoryRepository.deleteById(id);
        return "yes";
    }
}
