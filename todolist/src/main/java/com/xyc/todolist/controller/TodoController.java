package com.xyc.todolist.controller;

import com.sun.tools.javac.comp.Todo;
import com.xyc.todolist.anno.Login;
import com.xyc.todolist.entity.TodoList;
import com.xyc.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/todo")
public class TodoController {

    @Autowired
    private TodoListService todoListService;

    //创建todo
    @Login
    @PostMapping("/create")
    public TodoList createTodo(@RequestBody TodoList todoList) {
        //validUser 自己创建或者同组间创建
        TodoList todo = todoListService.createTodo(todoList);
        return todo;
    }

    //编辑todo


    //删除todo
}
