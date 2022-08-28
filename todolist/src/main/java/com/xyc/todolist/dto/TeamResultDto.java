package com.xyc.todolist.dto;

import com.xyc.todolist.entity.Team;
import lombok.Data;

@Data
public class TeamResultDto {
    private Team team;
    private Integer privilege;
}
