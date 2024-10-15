package com.xyc.im.codec.pack.friendship;

import lombok.Data;

import java.util.List;

@Data
public class DeleteFriendGroupMemberPack {
    public String fromId;

    private String groupName;

    private List<String> toIds;

    /** 序列号*/
    private Long sequence;
}
