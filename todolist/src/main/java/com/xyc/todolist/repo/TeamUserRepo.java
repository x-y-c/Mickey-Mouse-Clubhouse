package com.xyc.todolist.repo;

import com.xyc.todolist.entity.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamUserRepo extends JpaRepository<TeamUser, Integer> {
    List<TeamUser> findAllByTeamId(Integer teamId);

    List<TeamUser> findAllByTeamIdAndUserIdIn(Integer teamId, List<Integer> userIds);
}
