package com.xyc.todolist.service;

import com.xyc.todolist.entity.TodoList;

public interface TodoListService {

    /**
     * 创建todo
     * @param todoList
     * @return
     */
    public TodoList  createTodo(TodoList todoList);

    /**
     * 更新todo状态
     * @param todoId
     * @return
     */

    public boolean updateTodoStatus(Integer todoId);

    /**
     *  更新todo信息
     * @param todoList
     * @return
     */
    public TodoList updateTodoInfo(TodoList todoList);
}
