package com.xyc.im.common;

public enum ClientType {
    WEBAPI(0, "webapi"),
    WEB(1, "web"),
    IOS(2, "ios"),
    ANDROID(3, "android"),
    WINDOWS(4, "windows"),
    MAC(5, "mac");

    private int code;
    private String client;

    ClientType(int code, String client) {
        this.code = code;
        this.client = client;
    }

    public int getCode() {
        return code;
    }

    public String getClient() {
        return client;
    }
}
