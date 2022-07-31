package com.xyc.todolist.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "user")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "type")
    private Integer type;
    private String mobile;
    private String wxid;
    private String email;
}
