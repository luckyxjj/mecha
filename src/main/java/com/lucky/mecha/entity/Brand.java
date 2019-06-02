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
 * Description: 品牌
 */
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "brand")
public class Brand{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "name_cn",nullable = false)
    private String nameCn;

    @Basic
    @Column(name = "name_en",nullable = false)
    private String nameEn;

    @Basic
    @Column(name = "delete_flag",nullable = false)
    private Integer deleteFlag;

    @Basic
    @Column(name = "create_time",nullable = true)
    private Date createTime;

    @Basic
    @Column(name = "update_time",nullable = true)
    private Date updateTime;
}
