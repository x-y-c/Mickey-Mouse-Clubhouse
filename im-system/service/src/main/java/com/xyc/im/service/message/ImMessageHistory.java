package com.xyc.im.service.message;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "im_message_history")
public class ImMessageHistory {
    private Integer appId;
    private String fromId;
    private String toId;
    private String ownerId;
    private Long messageKey;
    private Long sequence;
    private String messageRandom;
    private Long messageTime;
    private Long createTime;
}
