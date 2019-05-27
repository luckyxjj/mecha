package com.lucky.mecha.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
@Table(name = "admin")
public class Admin extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "username",nullable = false)
    private String username;

    @Basic
    @Column(name = "password",nullable = false)
    private String password;

    @Basic
    @Column(name = "salt",nullable = false)
    private String salt;

    @Basic
    @Column(name = "last_login",nullable = false)
    private Date lastLogin;

    @Basic
    @Column(name = "type",nullable = false)
    private Integer type;

}
