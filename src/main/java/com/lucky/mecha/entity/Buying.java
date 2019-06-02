package com.lucky.mecha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 21:32
 * Description: 买机甲
 */
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "buying")
public class Buying{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "contact",nullable = false)
    private String contact;

    @Basic
    @Column(name = "delete_flag",nullable = false)
    private Integer deleteFlag;

    @Basic
    @Column(name = "flag",nullable = false)
    private String flag;

    @Basic
    @Column(name = "create_time",nullable = true)
    private Date createTime;

    @Basic
    @Column(name = "update_time",nullable = true)
    private Date updateTime;
}
