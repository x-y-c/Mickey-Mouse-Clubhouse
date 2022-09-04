package com.xyc.todolist.repo;

import com.xyc.todolist.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListRepo extends JpaRepository<TodoList, Integer> {
    List<TodoList> findAllByUserId(Integer userId);

    List<TodoList> findAllByUserIdAndStatus(Integer userId, Integer status);
}
