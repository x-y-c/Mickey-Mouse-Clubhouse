package com.xyc.todolist;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.xyc.todolist.entity.User;
import com.xyc.todolist.utils.JWTUtils;
import org.junit.jupiter.api.Test;

public class JWTTest {
    public static  void main(String[] args){
        User user =new User();
        user.setEmail("13681132624@163.com");
        user.setMobile("13681132624");
        user.setUsername("yangchen");
        user.setType(1);
        String token = JWTUtils.createToken(user);
        System.out.println("jwt token  generate :" + token);
        String s = JWTUtils.validateToken(token);
        DecodedJWT tokenInfo = JWTUtils.getTokenInfo(token);

        System.out.println(tokenInfo.getClaim("username").asString());

        System.out.println("validateToken is " + s);

    }
}
