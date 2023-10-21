package com.xyc.im.service.friendship;

import lombok.Data;

import java.util.Date;

@Data
public class ImFriendShip{
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
