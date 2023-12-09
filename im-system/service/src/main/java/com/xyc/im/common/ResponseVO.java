package com.xyc.im.common;

import com.xyc.im.common.exception.ApplicationExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO<T> {
    private int code;
    private String msg;
    private T data;

    public static ResponseVO successResponse(Object data) {
        return new ResponseVO(200, "succeess", data);
    }

    public static ResponseVO successResponse() {
        return new ResponseVO(200, "success");
    }

    public static ResponseVO errorResponse() {
        return new ResponseVO(500, "系统内部错误");
    }

    public static ResponseVO errorResponse(int code, String mgs) {
        return new ResponseVO(code, mgs);
    }

    public static ResponseVO errorResponse(ApplicationExceptionEnum exceptionEnum) {
        return new ResponseVO(exceptionEnum.getCode(), exceptionEnum.getError());
    }

    public boolean isOK() {
        return this.code == 200;
    }
    public ResponseVO(int code ,String msg){
        this.code = code;
        this.msg =msg;
    }
}
