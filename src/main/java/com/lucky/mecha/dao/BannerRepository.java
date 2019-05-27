package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface BannerRepository extends JpaRepository<Banner, Long> {
    List<Banner> findAllByTypeAndDeleteFlag(Integer type,Integer deleteFlag);
}
