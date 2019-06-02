package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Buying;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface BuyingRepository extends PagingAndSortingRepository<Buying, Long> {
    Page<Buying> findAllByDeleteFlag(Integer deleteFlag, Pageable pageable);

    Page<Buying> findByDeleteFlagAndContactLike(Integer deleteFlag,String contact, Pageable pageable);
}
