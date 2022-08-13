package com.xyc.todolist.dto;

import com.xyc.todolist.entity.User;
import lombok.Data;

@Data
public class UserDto {
    private String userName;
    private String email;
    private String jwtToken;
    public UserDto(User user){
        this.userName =user.getUsername();
        this.email =user.getEmail();
    }
}
