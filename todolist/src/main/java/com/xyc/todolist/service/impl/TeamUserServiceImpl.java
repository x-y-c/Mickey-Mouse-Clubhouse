package com.xyc.todolist.service.impl;

import com.xyc.todolist.dto.TeamUserDto;
import com.xyc.todolist.entity.TeamUser;
import com.xyc.todolist.repo.TeamUserRepo;
import com.xyc.todolist.service.TeamUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamUserServiceImpl implements TeamUserService {
    private TeamUserRepo teamUserRepo;

    /**
     * 添加todo小组人员
     *
     * @param teamUserDto 用teamuserDto进行包装
     * @return
     */

    @Override
    public List<TeamUser> addTeamUser(TeamUserDto teamUserDto) {
        List<Integer> normalUsers = teamUserDto.getNormalUsers();
        List<Integer> adminUsers = teamUserDto.getAdminUsers();
        Integer teamId = teamUserDto.getTeamId();
        List<TeamUser> addUserList = new ArrayList<>();
        normalUsers.forEach(
                userid -> {
                    TeamUser teamUser = new TeamUser();
                    teamUser.setUserId(userid);
                    teamUser.setUserType(0);
                    teamUser.setRemind(1);
                    teamUser.setTeamId(teamId);
                    addUserList.add(teamUser);

                }
        );
        adminUsers.forEach(adminuser -> {
            TeamUser teamUser = new TeamUser();
            teamUser.setUserId(adminuser);
            teamUser.setRemind(1);
            teamUser.setUserType(1);
            teamUser.setTeamId(teamId);
            addUserList.add(teamUser);
        });
        return teamUserRepo.saveAll(addUserList);
    }

    @Override
    public List<TeamUser> updateTeamUser(TeamUserDto teamUserDto) {
        //todo
        Integer teamId = teamUserDto.getTeamId();
        List<Integer> normalUsers = teamUserDto.getNormalUsers();
        List<TeamUser> allByTeamId = teamUserRepo.findAllByTeamId(teamId);
        //更新数据 先查出旧数据，然后清除旧数据；写入新数据；
        return addTeamUser(teamUserDto);

    }

    @Override
    public List<TeamUser> updateUsersToAdmin(TeamUserDto teamUserDto) {
        return null;
    }

    @Override
    public List<TeamUser> deleteUsers(TeamUserDto teamUserDto) {
        return null;
    }
}
