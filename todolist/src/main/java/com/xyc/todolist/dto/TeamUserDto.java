package com.xyc.todolist.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeamUserDto {

    private Integer teamId;

    /**
     * 管理员用户组（表示添加的管理员）
     */
    private List<Integer> adminUsers;

    /**
     * 标准用户组
     */
    private List<Integer> normalUsers;

    /**
     * 需要删除的用户
     */
    private List<Integer> deleteUsers;
}
