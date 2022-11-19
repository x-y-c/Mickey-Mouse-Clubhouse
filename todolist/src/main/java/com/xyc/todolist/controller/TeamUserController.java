package com.xyc.todolist.controller;

import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.dto.TeamUserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teamuser/")
public class TeamUserController {
    @RequestMapping("/add")
    public JsonResult addTeamUser(@RequestBody TeamUserDto teamUserDto) {
        return new JsonResult("");
    }

}
