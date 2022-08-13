package com.xyc.todolist.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;

import java.util.Date;

public class JWTUtils {

    public static String header = "Authorization";
    public static String tokenPrefix = "Bearer";
    public static String secret = "todo";
    public static Long expireTime = 3600 * 10L;
    public static final String USER_LOGIN_TOKEN = "USER_LOGIN_TOKEN";

    public void setHeader(String header) {
        JWTUtils.header = header;
    }

    public void setTokenPrefix(String tokenPrefix) {
        JWTUtils.tokenPrefix = tokenPrefix;
    }

    public void setSecret(String secret) {
        JWTUtils.secret = secret;
    }

    public void setExpireTime(Long expireTime) {
        JWTUtils.expireTime = expireTime;
    }

    /**
     * 创建jwttoken
     * @param sub
     * @return
     */
    public static String createToken(String sub) {
        return tokenPrefix + JWT.create().withSubject(sub)
                .withExpiresAt(new Date(System.currentTimeMillis() + expireTime))
                .sign(Algorithm.HMAC256(secret));
    }

    /**
     * 验证token
     * @param token
     * @return
     */
    public static String validateToken(String token) {
        try {
            return JWT.require(Algorithm.HMAC512(secret)).build()
                    .verify(token.replace(tokenPrefix, "")).getSubject();
        } catch (TokenExpiredException e) {
            throw new RuntimeException("token已经过期");
        } catch (Exception e) {
            throw new RuntimeException("token验证失败");
        }
    }

    /**
     * 判断是否需要更新
     * @param token
     * @return
     */
    public static boolean needUpdate(String token) {
        Date expiresAt = null;

        try {
            expiresAt = JWT.require(Algorithm.HMAC512(secret))
                    .build()
                    .verify(token.replace(tokenPrefix, ""))
                    .getExpiresAt();
        } catch (TokenExpiredException e) {
            return true;
        } catch (Exception e) {
            throw new RuntimeException("token验证失败");
        }
        return (expiresAt.getTime() - System.currentTimeMillis()) < (expireTime / 2);
    }
}
