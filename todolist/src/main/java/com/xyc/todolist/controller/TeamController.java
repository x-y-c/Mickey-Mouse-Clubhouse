package com.xyc.todolist.controller;

import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.entity.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/team")
public class TeamController {
    /**
     * 创建小组
     *
     * @return 创建小组的状态（是否创建成功）
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public JsonResult createTeam(Team team) {
        return new JsonResult("");
    }

    /**
     * 更新小组信息
     *
     * @param team
     * @return 小组更新状态
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public JsonResult updateTeam(Team team) {
        return new JsonResult("");
    }

    /**
     * 删除对应的小组（逻辑删除）
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public JsonResult deleteTeamById(Integer id) {
        return new JsonResult("success");
    }

    /**
     * 根据用户id获取小组信息
     *
     * @return
     */
    public JsonResult getTeamList() {
        return new JsonResult("");


    }

}
