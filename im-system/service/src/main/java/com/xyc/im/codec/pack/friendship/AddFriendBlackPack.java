package com.xyc.im.codec.pack.friendship;

import lombok.Data;

/**
 * 用户添加黑名单以后tcp通知数据包
 */
@Data
public class AddFriendBlackPack {
    private String fromId;
    private String toId;
    private Long sequence;
}
