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

    @Column(name = "begin_time")
    private Timestamp beginTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    private Integer level;

    private Integer remind;

    private Timestamp createtime;

    private Timestamp updatetime;

    @PostUpdate
    public void update(){
        this.updatetime = new Timestamp(System.currentTimeMillis());
    }
}
