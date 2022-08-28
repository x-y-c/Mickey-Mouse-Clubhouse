package com.xyc.todolist.service.impl;

import com.xyc.todolist.dto.TeamResultDto;
import com.xyc.todolist.entity.Team;
import com.xyc.todolist.entity.TeamUser;
import com.xyc.todolist.repo.TeamRepo;
import com.xyc.todolist.repo.TeamUserRepo;
import com.xyc.todolist.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public List<TeamResultDto> getTeamList(Integer userid) {
        // 先根据id在teamuser表中查出所有的组id，然后通过组id查询Team信息
        List<TeamUser> teamUsers = teamUserRepo.findDistinctByUserId(userid);
        List<Integer> teamIds = teamUsers.stream().map(teamUser -> teamUser.getTeamId()).collect(Collectors.toList());
        List<Team> teams = teamRepo.findAllById(teamIds);
        Map<Integer, Team> idTeamMap = new HashMap<>();
        teams.forEach(team -> idTeamMap.put(team.getId(), team));
        List<TeamResultDto> list = new ArrayList<>();
        teamUsers.forEach(teamUser -> {
            TeamResultDto teamResultDto = new TeamResultDto();
            teamResultDto.setPrivilege(teamUser.getUserType());
            teamResultDto.setTeam(idTeamMap.get(teamUser.getTeamId()));
            list.add(teamResultDto);
        });
        return list;
    }
}
