package com.xyc.im.common.exception;

public class ApplicationException extends RuntimeException {
    private int code;
    private String error;


    public ApplicationException(ApplicationExceptionEnum exception){
        super(exception.getError());
        this.code = exception.getCode();
        this.error = exception.getError();
    }

    public int getCode(){
        return code;
    }

    public String getError(){
        return error;
    }

    public Throwable fillInStackTrace(){
        return this;
    }
}
