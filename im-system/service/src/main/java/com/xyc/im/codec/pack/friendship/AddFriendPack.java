package com.xyc.im.codec.pack.friendship;

import lombok.Data;

/**
 * 添加好友数据
 */
@Data
public class AddFriendPack {
    private String fromId;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 被添加的人
     */
    private String toId;
    /**
     * 好友来源
     */
    private String addSource;
    /**
     * 添加好友信息
     */
    private String addWording;
    private Long sequence;
}
