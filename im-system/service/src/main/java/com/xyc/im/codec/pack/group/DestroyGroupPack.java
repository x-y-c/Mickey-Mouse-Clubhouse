package com.xyc.im.codec.pack.group;

import lombok.Data;

@Data
public class DestroyGroupPack {
    private String groupId;

    private Long sequence;
}
