package com.xyc.todolist.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.xyc.todolist.entity.User;

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
     *
     * @param user
     * @return
     */
    public static String createToken(User user) {
        return tokenPrefix + JWT.create().withClaim("userId", user.getId())
                .withClaim("key", user.getPassword())
                .withClaim("username",user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + expireTime))
                .sign(Algorithm.HMAC256(secret));
    }

    /**
     * 验证token
     *
     * @param token
     * @return
     */
    public static String validateToken(String token) {
        try {
            return getTokenInfo(token).getClaim("username").asString();
        } catch (TokenExpiredException e) {
            throw new RuntimeException("token已经过期");
        } catch (Exception e) {
            throw new RuntimeException("token验证失败");
        }
    }


    /**
     * 判断是否需要更新
     *
     * @param token
     * @return
     */
    public static boolean needUpdate(String token) {
        Date expiresAt = null;

        try {
            expiresAt = getTokenInfo(token).getExpiresAt();
        } catch (TokenExpiredException e) {
            return true;
        } catch (Exception e) {
            throw new RuntimeException("token验证失败");
        }
        return (expiresAt.getTime() - System.currentTimeMillis()) < (expireTime / 2);
    }

    public static DecodedJWT getTokenInfo(String token) {
        try {
            token = token.replace(tokenPrefix,"");
            return JWT.require(Algorithm.HMAC256(secret)).build().verify(token);
        } catch (Exception e) {
            return null;
        }
    }

    public static Integer getUserId(DecodedJWT decodedJWT) {
        if (decodedJWT == null) {
            return -1;
        } else {
            return decodedJWT.getClaim("userId").asInt();
        }
    }
}

