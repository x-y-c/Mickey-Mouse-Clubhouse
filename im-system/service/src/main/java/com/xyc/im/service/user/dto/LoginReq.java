package com.xyc.im.service.user.dto;

import lombok.Data;

@Data
public class LoginReq {
    private String userId;

    private Integer appId;
    private Integer clientType;
}
