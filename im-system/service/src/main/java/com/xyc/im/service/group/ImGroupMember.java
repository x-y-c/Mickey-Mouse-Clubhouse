package com.xyc.im.service.group;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "im_group_member")
public class ImGroupMember {
    @Id
    private Long groupMemberId;

    private Integer appId;
    private String groupId;
    private String memberId;

    private Integer role;
    private Long speakDate;
    /**
     * 昵称
     */
    private String alias;

    private Long joinTime;
    private Long leaveTime;
    private String joinType;
    private String extra;
}
