package com.xyc.im.codec.pack.friendship;

import lombok.Data;

import java.util.List;

/**
 * 好友分组添加成员通知
 */
@Data
public class AddFriendGroupMemberPack {
    public String fromId;
    private String groupName;
    private List<String> toIds;
    private Long sequence;
}
