package com.xyc.todolist.service;

import com.xyc.todolist.entity.Team;

public interface TeamService {

    /**
     * 创建todo小组
     * @param team
     * @return
     */
    public Team createTeam(Team team);

    /**
     * 更新组信息
     * @param team
     * @return
     */
    public Team updateTeam(Team team);

    /**
     * 删除组
     * @param teamId
     * @return
     */
    public boolean delTeam(Integer teamId);


}
