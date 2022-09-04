package com.xyc.todolist.service;

import com.mysql.cj.util.EscapeTokenizer;
import com.xyc.todolist.entity.TodoList;

import java.util.List;

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

    /**
     * 获取todo清单
     * @param userId
     * @return
     */
    public List<TodoList>getTodolist(Integer userId);

    /**
     * 获取不同类型的todo清单，如 已完成 未完成 等等
     * @param userId
     * @param type
     * @return
     */
    public List<TodoList> getTodoList(Integer userId,Integer type);
}
