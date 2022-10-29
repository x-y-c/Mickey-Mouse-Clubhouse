package com.xyc.todolist.service.impl;

import com.xyc.todolist.dto.JsonResult;
import com.xyc.todolist.dto.ResultCode;
import com.xyc.todolist.dto.UserDto;
import com.xyc.todolist.entity.User;
import com.xyc.todolist.repo.UserRepo;
import com.xyc.todolist.service.UserService;
import com.xyc.todolist.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public JsonResult login(String email, String password) {
        User user = userRepo.findByEmailAndEnableIsTrue(email);
        if (user == null) {
            return JsonResult.errorResult(ResultCode.USER_NOT_EXIST, "用户不存在", "");
        }
        if (!user.getPassword().equals(password)) {
            return JsonResult.errorResult(ResultCode.WRONG_PASSWORD, "用户名或密码不正确", "");
        }
        UserDto userDto = new UserDto(user);
        userDto.setJwtToken(JWTUtils.createToken(user));
        return JsonResult.succResult("登录成功", userDto);
    }

    @Override
    public JsonResult register(User user) {
        if (user == null) {
            return JsonResult.errorResult(ResultCode.WRONG_PARAMS, "信息不能为空", "");
        }
        if (userRepo.countByEmailAAndEnableIsTrue(user.getEmail()) > 0) {
            return JsonResult.errorResult(ResultCode.USER_EXIST, "该邮箱已经存在", "");
        }
        userRepo.save(user);
        return JsonResult.succResult(ResultCode.SUCCESS, "注册成功");
    }

    @Override
    public JsonResult resetPassword(String oldPassword, String email, String newPassword) {
        User user = userRepo.findByEmailAndPassword(email, oldPassword);
        if (user != null) {
            user.setPassword(newPassword);
            userRepo.save(user);
            return JsonResult.succResult(ResultCode.SUCCESS, "修改密码成功");
        } else {
            return JsonResult.errorResult(ResultCode.WRONG_PASSWORD, "用户不存在或密码不正确", "");
        }
    }

    @Override
    public boolean validUserPermission(Integer currentUser, Integer targetUser) {
        return currentUser.equals(targetUser);
    }
}
