package com.xyc.im.service.user.dto;

import lombok.Data;

import java.util.List;

@Data
public class PullUserOnlineStatusReq {
    private List<String>userList;
}
