package com.lucky.mecha.dao;

import com.lucky.mecha.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface AboutRepository extends JpaRepository<About, Long> {
    About findByTypeAndDeleteFlag(Integer type,Integer deleteFlag);
    List<About> findAll();
}
