package com.xyc.im.codec.pack.group;

import lombok.Data;

/**
 * 删除群成员消息
 */
@Data
public class RemoveGroupMemberPack {

    private String groupId;

    private String member;
}
