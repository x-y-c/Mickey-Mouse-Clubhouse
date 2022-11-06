package com.xyc.todolist.service;

import com.xyc.todolist.entity.TodoList;

import java.util.List;

public interface TodoListService {

    /**
     * 创建todo
     *
     * @param todoList todo对象
     * @return 返回创建成功的todo清单
     */
    TodoList createTodo(TodoList todoList);

    /**
     * 更新todo状态
     *
     * @param todoId
     * @return
     */

    boolean updateTodoStatus(Integer todoId, Integer userId, Integer status);

    /**
     * 更新todo信息
     *
     * @param todoList
     * @return
     */
    TodoList updateTodoInfo(TodoList todoList, Integer userId);

    /**
     * 获取todo清单
     *
     * @param userId
     * @return
     */
    List<TodoList> getTodolist(Integer userId);

    /**
     * 获取不同类型的todo清单，如 已完成 未完成 等等
     *
     * @param userId
     * @param type
     * @return
     */
    List<TodoList> getTodoList(Integer userId, Integer type);

    /**
     * 组内可以相互查看todo；
     */
    boolean deleteTodo(Integer todoId,Integer userId);
}
