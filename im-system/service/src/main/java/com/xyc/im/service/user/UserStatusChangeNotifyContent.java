package com.xyc.im.service.user;

import lombok.Data;

@Data
public class UserStatusChangeNotifyContent {
    private String userId;
    /**
     * 1 为上线，2 为离线
     */
    private Integer status;

}
