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
 * Description: 轮播图
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "banner")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Banner{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "name",nullable = false)
    private String name;

    @Basic
    @Column(name = "url_cn",nullable = false)
    private String urlCn;

    @Basic
    @Column(name = "url_en",nullable = false)
    private String urlEn;

    @Basic
    @Column(name = "run_url",nullable = false)
    private String runUrl;

    @Basic
    @Column(name = "type",nullable = false)
    private Integer type;

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
