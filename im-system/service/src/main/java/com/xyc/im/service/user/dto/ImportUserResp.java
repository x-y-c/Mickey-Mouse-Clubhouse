package com.xyc.im.service.user.dto;

import lombok.Data;

import java.util.List;

/**
 * 导入用户信息返回类
 */
@Data
public class ImportUserResp {
    private List<String>successId;
    private List<String>errorId;
}
