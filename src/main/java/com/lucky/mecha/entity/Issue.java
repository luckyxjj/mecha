package com.lucky.mecha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 21:32
 * Description: 机甲设备发布
 */
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "issue")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "category_name",nullable = false)
    private String categoryName;

    @Basic
    @Column(name = "brand_name",nullable = false)
    private String brandName;

    @Basic
    @Column(name = "unit_type",nullable = false)
    private String unitType;

    @Basic
    @Column(name = "province",nullable = false)
    private String province;

    @Basic
    @Column(name = "city",nullable = false)
    private String city;

    @Basic
    @Column(name = "district",nullable = false)
    private String district;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "expected_price",nullable = false)
    private BigDecimal expectedPrice;

    @Basic
    @Column(name = "delivery_time",nullable = false)
    private Date deliveryTime;

    @Basic
    @Column(name = "img_url",nullable = false)
    private String imgUrl;

    @Basic
    @Column(name = "linkman",nullable = false)
    private String linkman;

    @Basic
    @Column(name = "sex",nullable = false)
    private Integer sex;

    @Basic
    @Column(name = "phone",nullable = false)
    private String phone;

    @Basic
    @Column(name = "mail",nullable = false)
    private String mail;

    @Basic
    @Column(name = "wechat",nullable = false)
    private String wechat;

    @Basic
    @Column(name = "using_experience",nullable = false)
    private String usingExperience;

    @Basic
    @Column(name = "status",nullable = false)
    private Integer status;

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
