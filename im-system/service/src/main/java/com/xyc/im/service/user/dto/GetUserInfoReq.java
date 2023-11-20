package com.xyc.im.service.user.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetUserInfoReq {
    private List<String> userIds;
}
