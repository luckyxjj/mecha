package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface BrandRepository extends JpaRepository<Brand, Long> {
    List<Brand> findAllByDeleteFlag(Integer deleteFlag);
}
