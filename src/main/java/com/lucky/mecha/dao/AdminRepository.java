package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsernameAndPasswordAndDeleteFlag(String username,String password,Integer deleteFlag);
    Admin findByUsername(String username);
}
