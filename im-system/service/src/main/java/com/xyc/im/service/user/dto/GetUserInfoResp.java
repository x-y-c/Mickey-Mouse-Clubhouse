package com.xyc.im.service.user.dto;

import com.xyc.im.service.user.entity.ImUserData;
import lombok.Data;

import java.util.List;

/**
 * 用户信息返回
 */
@Data
public class GetUserInfoResp {
    private List<ImUserData> userDataItem;
    private List<String> failUser;
}
