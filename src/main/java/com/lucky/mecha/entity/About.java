package com.lucky.mecha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 21:32
 * Description: 关于我们
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "about")
public class About extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "content",nullable = false)
    private String content;

    @Basic
    @Column(name = "type",nullable = false)
    private Integer type;

    @Basic
    @Column(name = "delete_flag",nullable = false)
    private Integer deleteFlag;
}
