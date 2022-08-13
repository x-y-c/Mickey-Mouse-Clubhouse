package com.xyc.todolist.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

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
    private Integer enable;
    private Timestamp createtime;
    private Timestamp updatetime;

    @PostUpdate
    public void setDefaultData() {
        this.updatetime = new Timestamp(System.currentTimeMillis());
    }
}
