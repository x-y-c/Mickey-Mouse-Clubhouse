package com.xyc.im.codec.pack.group;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DestroyGroupPack {
    private String groupId;

    private Long sequence;
}
