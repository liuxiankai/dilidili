package com.liuxiankai.dilidili.provider.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`user`")
public class Admin {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "userName")
    private String username;

    @Column(name = "dbSource")
    private String dbsource;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String pwd;
}