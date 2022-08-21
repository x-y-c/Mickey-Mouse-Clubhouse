package com.xyc.todolist.service.impl;

import com.xyc.todolist.entity.Team;
import com.xyc.todolist.repo.TeamRepo;
import com.xyc.todolist.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepo teamRepo;


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
}
