package com.xyc.todolist.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "describe")
    private String describe;

    private int theme;

    @Column(name = "theme_info")
    private String themeInfo;

    private Timestamp createtime;

    private Timestamp updatetime;


    @PostUpdate
    public void setDefault(){
        this.updatetime = new Timestamp(System.currentTimeMillis());
    }
}
