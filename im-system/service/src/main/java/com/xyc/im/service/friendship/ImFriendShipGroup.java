package com.xyc.im.service.friendship;


import lombok.Data;

@Data
public class ImFriendShipGroup {
    private Long groupId;
    private String fromId;
    private Integer appId;
    private String groupName;
    private Long createTime;
    private Long updateTime;
    private Long sequence;
    private Integer delFlag;
}
