package com.xyc.todolist.controller;

import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.dto.TeamUserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teamuser/")
public class TeamUserController {
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonResult addTeamUser(@RequestBody TeamUserDto teamUserDto) {
        return new JsonResult("");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public JsonResult updateTeamUser(@RequestBody TeamUserDto teamUserDto) {
        return new JsonResult("");
    }

    @RequestMapping(value = "/updateUserToAdmin", method = RequestMethod.POST)
    public JsonResult updateUsersToAdmin(@RequestBody TeamUserDto teamUserDto) {
        return new JsonResult("");
    }

    @RequestMapping(value = "/deleteTeamUser", method = RequestMethod.POST)
    public JsonResult deleteTeamUser(@RequestBody TeamUserDto teamUserDto) {
        return new JsonResult("");
    }

}
