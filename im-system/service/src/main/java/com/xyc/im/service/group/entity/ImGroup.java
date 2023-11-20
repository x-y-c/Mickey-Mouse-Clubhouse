package com.xyc.im.service.group.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "im_group")
public class ImGroup {

    @Id
    private Long id;

    private String groupId;
    private Integer appId;
    private String ownerId;
    /**
     * 群类型 1、私有群 2 公开群
     */
    private Integer groupType;

    /**
     * 是否开启禁言
     */
    private Integer mute;

    /**
     * 加群条件
     * 0 任何人禁止申请加入
     * 1 需要群主或者管理员审批
     * 2 表示允许无需审批自由加入群组
     */
    private Integer appJoinType;

    private String introduction;
    private String notification;
    private String photo;
    private Integer maxMemberCount;
    /**
     * 群状态 0 正常 1 解散
     */
    private Integer status;

    private Long sequence;

    private Long createTime;
    private Long updateTime;
    /**
     * 扩展字段，用json存
     */
    private String extra;
}
