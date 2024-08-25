package com.xyc.im.codec.config;

import lombok.Data;

@Data
public class BootstrapConfig {

    public static class TcpConfig {
        private Integer tcpPort;
        private Integer webSocketPort;
        private boolean enableWebSocket;
        private Integer bossThreadSize;
        private Integer workThreadSize;

        private Long heartBeatTime;
        private Integer loginModel;

    }
}
