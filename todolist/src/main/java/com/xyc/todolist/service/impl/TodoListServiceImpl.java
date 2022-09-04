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
        Integer id = todoList.getId();
        Optional<TodoList> optional = todoListRepo.findById(id);
        if (optional.isPresent()) {
            TodoList oldTodoList = optional.get();
            if (oldTodoList.getUserId().equals(userId)) {
                todoList.setId(oldTodoList.getId());
                todoListRepo.save(todoList);
            }
        }
        //todo 这种应该抛出异常，然后前端给个提示；
        return todoList;
    }

    @Override
    public List<TodoList> getTodolist(Integer userId) {
        return todoListRepo.findAllByUserId(userId);
    }

    @Override
    public List<TodoList> getTodoList(Integer userId, Integer status) {
        return todoListRepo.findAllByUserIdAndStatus(userId, status);
    }
}
