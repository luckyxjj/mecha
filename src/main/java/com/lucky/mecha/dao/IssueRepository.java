package com.lucky.mecha.dao;

import com.lucky.mecha.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 22:00
 * Description:
 */
public interface IssueRepository extends JpaRepository<Issue, Long>{

}
