package com.xyc.im.service.friendship.entity;

import jakarta.persistence.Table;
import lombok.Data;

/**
 * 群成员表
 */
@Data
@Table(name = "im_friendship_group_member")
public class ImFriendShipGroupMember {
    /**
     * 群组id
     */
    private Long groupId;
    /**
     * 用户id
     */
    private String toId;
}
