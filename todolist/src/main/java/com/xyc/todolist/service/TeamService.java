package com.xyc.todolist.service;

import com.xyc.todolist.entity.Team;

import java.util.List;

public interface TeamService {

    /**
     * 创建todo小组
     *
     * @param team
     * @return
     */
    public Team createTeam(Team team);

    /**
     * 更新组信息
     *
     * @param team
     * @return
     */
    public Team updateTeam(Team team);

    /**
     * 删除组
     *
     * @param teamId
     * @return
     */
    public boolean delTeam(Integer teamId);

    /**
     * 列出当前用户能看到的组信息
     *
     * @param userid 当前登录用户id
     * @return 组信息列表
     */
    public List<Team> getTeamList(Integer userid);


}
