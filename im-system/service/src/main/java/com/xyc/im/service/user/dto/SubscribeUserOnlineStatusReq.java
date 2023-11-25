package com.xyc.im.service.user.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubscribeUserOnlineStatusReq {
    private List<String> subUserId;
    private Long subTime;

}
