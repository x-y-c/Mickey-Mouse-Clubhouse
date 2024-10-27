package com.xyc.im.codec.pack.group;

import lombok.Data;

/**
 * 修改群成员
 */
@Data
public class UpdateGroupMemberPack {
    /**
     * 群id
     *
     */
    private String groupId;
    /**
     * 群成员id
     */

    private String memberId;

    private String alias;

    private String extra;
}
