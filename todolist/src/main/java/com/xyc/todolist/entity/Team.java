package com.xyc.todolist.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "teamname")
    private String teamName;

    @Column(name = "describe")
    private String describe;

    private int theme;

    @Column(name = "theme_info")
    private String themeInfo;
}
