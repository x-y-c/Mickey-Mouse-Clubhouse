package com.xyc.todolist.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "todolist")
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "main_id")
    private Integer mainId;
    @Column(name = "user_id")
    private Integer userId;
    private String content;
    @Column(name = "beginTime")
    private Timestamp beginTime;
    @Column(name = "endTime")
    private Timestamp endtTime;
    private Integer level;
    private int remind;
}
