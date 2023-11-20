package com.xyc.im.service.user.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 删除用户 包装对象
 */
@Data
public class DeleteUserReq {
    @NotEmpty(message ="用户id不能为空")
    private List<String> userId;
}
