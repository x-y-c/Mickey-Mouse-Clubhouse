package com.xyc.todolist.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.xyc.todolist.anno.Login;
import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.entity.TodoList;
import com.xyc.todolist.service.TodoListService;
import com.xyc.todolist.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController("/todo")
public class TodoController {

    @Autowired
    private TodoListService todoListService;

    //创建todo
    @Login
    @PostMapping("/create")
    public JsonResult createTodo(HttpServletRequest request, @RequestBody TodoList todoList) {
        //validUser 自己创建或者同组间创建
        DecodedJWT token = JWTUtils.getTokenInfo(request.getHeader("token"));
        Integer userId = JWTUtils.getUserId(token);
        TodoList todo = todoListService.createTodo(todoList);
        return new JsonResult("");
    }

    //编辑todo
    @Login
    @PostMapping("/update")
    public JsonResult updateTodo(HttpServletRequest request, @RequestBody TodoList todoList) {
        String token = request.getHeader("token");
        DecodedJWT tokenInfo = JWTUtils.getTokenInfo(token);
        Integer userId = JWTUtils.getUserId(tokenInfo);
        todoListService.updateTodoInfo(todoList, userId);
        return new JsonResult("");
    }


    //删除todo
    @Login
    @PostMapping("/delete")
    public JsonResult delete(Integer todoId, HttpServletRequest request) {
        String token = request.getHeader("token");
        DecodedJWT tokenInfo = JWTUtils.getTokenInfo(token);
        Integer userId = JWTUtils.getUserId(tokenInfo);
        todoListService.deleteTodo(todoId, userId);
        return new JsonResult("");
    }
}
