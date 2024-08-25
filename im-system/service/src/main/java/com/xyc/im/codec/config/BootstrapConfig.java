package com.xyc.im.codec.config;

import lombok.Data;

@Data
public class BootstrapConfig {

    public static class TcpConfig {
        /**
         * tcp需要绑定的端口号
         */
        private Integer tcpPort;
        /**
         * webSocket绑定的端口号
         */
        private Integer webSocketPort;
        /**
         * 是否开启webSocket
         */
        private boolean enableWebSocket;
        /**
         * boss 线程
         */
        private Integer bossThreadSize;
        /**
         * 工作线程netty
         */
        private Integer workThreadSize;
        /**
         * 心跳检测时间，ms
         */
        private Long heartBeatTime;
        /**
         * 登录模式
         */
        private Integer loginModel;

    }
}
