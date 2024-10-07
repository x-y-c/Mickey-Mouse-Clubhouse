package com.xyc.im.codec.pack.friendship;

import lombok.Data;

/**
 * 添加好友分组数据包
 */
@Data
public class AddFriendGroupPack {
    public String fromId;
    public String groupName;
    public Long sequence;
}
