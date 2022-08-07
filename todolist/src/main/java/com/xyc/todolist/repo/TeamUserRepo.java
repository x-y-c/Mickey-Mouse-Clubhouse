package com.xyc.todolist.repo;

import com.xyc.todolist.entity.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamUserRepo extends JpaRepository<TeamUser,Integer> {
}
