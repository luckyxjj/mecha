package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Counseling;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface CounselingRepository extends JpaRepository<Counseling, Long> {
    Counseling findByTypeAndDeleteFlag(Integer type,Integer deleteFlag);
}
