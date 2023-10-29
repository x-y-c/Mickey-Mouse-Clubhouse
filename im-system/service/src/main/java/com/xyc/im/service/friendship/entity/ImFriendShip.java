package com.xyc.im.service.friendship.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "im_friend_ship")
public class ImFriendShip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer appId;
    private String fromId;
    private String toId;
    private String remark;
    private Integer status;
    private Integer black;
    private Date createTime;
    private Integer friendSequence;

    private Integer blackSequence;
    private String addSource;
    private String extra;


}
