package com.xyc.im.codec.pack.friendship;

import lombok.Data;

@Data
public class AddFriendGroupPack {
    public String fromId;
    public String groupName;
    public Long sequence;
}
