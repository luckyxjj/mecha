package com.lucky.mecha.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.util.Date;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 21:43
 * Description:
 */
@Data
public class BaseEntity {

    @Basic
    @Column(name = "flag",nullable = false)
    private String flag;




}
