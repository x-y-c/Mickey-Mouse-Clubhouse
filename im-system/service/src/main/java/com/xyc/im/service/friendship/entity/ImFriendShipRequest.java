package com.xyc.im.service.friendship.entity;

import jakarta.persistence.Table;
import lombok.Data;

/**
 * 群组申请记录信息
 */
@Table(name = "im_friendship_request")
@Data
public class ImFriendShipRequest {
    private Long id;
    private Integer appId;
    private String fromId;
    private String toId;
    private String remark;
    private Integer readStatus;
    /**
     * 好友来源
     */
    private String addSource;
    /**
     * 申请描述（备注信息）
     */
    private String addWording;

    /**
     * 审批状态
     */
    private Integer approveStatus;

    private Long createTime;
    private Long updateTime;

    private Long sequence;
}
