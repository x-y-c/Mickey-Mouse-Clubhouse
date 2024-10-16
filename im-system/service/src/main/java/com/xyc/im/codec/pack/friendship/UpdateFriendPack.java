package com.xyc.im.codec.pack.friendship;

import lombok.Data;

@Data
/**
 * 修改好友信息
 */
public class UpdateFriendPack {
    public String fromId;

    private String toId;

    private String remark;

    private Long sequence;
}
