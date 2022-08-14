package com.xyc.todolist.common;

import com.xyc.todolist.anno.Login;
import com.xyc.todolist.utils.JWTUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if (method.isAnnotationPresent(Login.class)) {
            Login login = method.getAnnotation(Login.class);
            if (login.required()) {
                if (token == null) {
                    throw new RuntimeException("token信息无效，请登录");
                }
                //todo 更新密码的后的token验证有问题 需要解码后查询一次数据库
                String s = JWTUtils.validateToken(token);
                return s != null;
            }
        }


        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
