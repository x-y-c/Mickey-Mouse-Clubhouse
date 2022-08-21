package com.xyc.todolist.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "team_user")
public class TeamUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_type")
    private Integer userType;

    private Integer remind;

    @Column(name = "team_id")
    private Integer teamId;

    private Timestamp createtime;
    private Timestamp updatetime;

    @PostUpdate
    public void update(){
        this.updatetime =new Timestamp(System.currentTimeMillis());
    }
}
