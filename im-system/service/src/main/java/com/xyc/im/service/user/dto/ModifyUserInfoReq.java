package com.xyc.im.service.user.dto;

import lombok.Data;

@Data
public class ModifyUserInfoReq {
    private String userId;
    private String location;
    private String birthday;
    private String password;

    private String phone;
    private String userSex;
    private String selfSignature;

    /**
     * 加好友验证
     */
    private Integer friendAllowType;

    private String extra;
}
