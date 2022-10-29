package com.xyc.todolist.service;

import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.entity.User;

public interface UserService {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return 返回jwt token信息
     */
    JsonResult login(String username,String password);

    /**
     * 注册新用户；
     * @param user
     * @return
     */
    JsonResult register(User user);


    /**
     * 重置密码；
     * @param username
     * @param email
     * @param newPassword
     * @return
     */
    JsonResult resetPassword(String username,String email,String newPassword);


    /**
     * 用来判断使用是否有操作的权限
     * @param currentUser 当前操作用户
     * @param targetUser 被操作的用户
     * @return 默认如果同一个用户有权限，，另外有该组管理员权限的，有权限操作
     */
    boolean validUserPermission(Integer currentUser,Integer targetUser);



}
