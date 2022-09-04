package com.xyc.todolist.service.impl;

import com.xyc.todolist.entity.TodoList;
import com.xyc.todolist.repo.TodoListRepo;
import com.xyc.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    private TodoListRepo todoListRepo;

    @Override
    public TodoList createTodo(TodoList todoList) {
        return todoListRepo.save(todoList);
    }

    @Override
    public boolean updateTodoStatus(Integer todoId, Integer userId, Integer status) {
        Optional<TodoList> todoOptional = todoListRepo.findById(todoId);
        if (todoOptional.isPresent()) {
            TodoList todoList = todoOptional.get();
            if (todoList.getUserId().equals(userId)) {
                todoList.setStatus(status);
                todoListRepo.save(todoList);
                return true;
            }
        }
        return false;
    }

    @Override
    public TodoList updateTodoInfo(TodoList todoList, Integer userId) {
        return null;
    }

    @Override
    public List<TodoList> getTodolist(Integer userId) {
        return null;
    }

    @Override
    public List<TodoList> getTodoList(Integer userId, Integer status) {
        return null;
    }
}
