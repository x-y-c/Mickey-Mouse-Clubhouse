package com.xyc.todolist.service;

import com.xyc.todolist.dto.TeamUserDto;
import com.xyc.todolist.entity.TeamUser;

import java.util.List;

public interface TeamUserService {
    /**
     * 添加小组成员
     * @return
     */
    List<TeamUser> addTeamUser(TeamUserDto teamUserDto);

    /**
     *  更新小组成员
     * @param teamUserDto
     * @return
     */
    List<TeamUser> updateTeamUser(TeamUserDto teamUserDto);
}
