package com.xyc.todolist.controller;

import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.entity.User;
import com.xyc.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JsonResult register(@RequestBody User user) {
        JsonResult register = userService.register(user);
        return register;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JsonResult login(String username, String password) {
        return userService.login(username, password);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public JsonResult updateUserInfo(User user) {
        //这个修改密码的逻辑有bug，一般是先填写邮箱，然后邮箱中接收到邮件，在邮件中包含重置链接，最后通过链接重置密码
        JsonResult jsonResult = userService.resetPassword(user.getUsername(), user.getEmail(), user.getPassword());
        return jsonResult;
    }

}
