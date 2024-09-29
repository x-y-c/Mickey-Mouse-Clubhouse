package com.xyc.im.codec.pack.group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddGroupMemberPack {
    private String groupId;

    private List<String> members;

}
