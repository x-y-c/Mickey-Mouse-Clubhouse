package com.xyc.im.service.friendship.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "im_friend_ship_group")
public class ImFriendShipGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long groupId;
    private String fromId;
    private Integer appId;
    private String groupName;
    private Long createTime;
    private Long updateTime;
    private Long sequence;
    private Integer delFlag;
}
