package com.lucky.mecha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * User: lucky
 * Date: 2019/5/25
 * Time: 21:32
 * Description: 买机甲
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "buying")
public class Buying extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "contact",nullable = false)
    private String contact;


}
