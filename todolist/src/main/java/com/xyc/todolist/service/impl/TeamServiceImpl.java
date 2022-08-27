package com.xyc.todolist.service.impl;

import com.xyc.todolist.entity.Team;
import com.xyc.todolist.entity.TeamUser;
import com.xyc.todolist.repo.TeamRepo;
import com.xyc.todolist.repo.TeamUserRepo;
import com.xyc.todolist.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepo teamRepo;
    @Autowired
    private TeamUserRepo teamUserRepo;


    @Override
    public Team createTeam(Team team) {
        return teamRepo.save(team);

    }

    @Override
    public Team updateTeam(Team team) {
        return teamRepo.save(team);
    }

    @Override
    public boolean delTeam(Integer teamId) {
        teamRepo.deleteById(teamId);
        return true;
    }

    @Override
    public List<Team> getTeamList(Integer userid) {
        //todo 需要包装一层，不然不知道这个人对群组的权限；
        // 先根据id在teamuser表中查出所有的组id，然后通过组id查询Team信息
        List<TeamUser> teamUsers = teamUserRepo.findDistinctByUserId(userid);
        List<Integer> teamIds = teamUsers.stream().map(teamUser -> teamUser.getTeamId()).collect(Collectors.toList());
        return teamRepo.findAllById(teamIds);
    }
}
