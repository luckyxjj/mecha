package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Buying;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface BuyingRepository extends JpaRepository<Buying, Long> {
    List<Buying> findByContactLike(String contact);
}
