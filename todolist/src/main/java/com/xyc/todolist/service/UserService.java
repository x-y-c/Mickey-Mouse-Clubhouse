package com.xyc.todolist.service;

import com.xyc.todolist.dto.JsonResult;

public interface UserService {
    JsonResult login(String username,String password);

}
