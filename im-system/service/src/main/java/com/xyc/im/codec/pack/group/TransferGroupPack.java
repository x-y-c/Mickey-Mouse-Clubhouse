package com.xyc.im.codec.pack.group;

import lombok.Data;

/**
 * 交换群主
 */
@Data
public class TransferGroupPack {
    private String groupId;

    private String ownerId;
}
