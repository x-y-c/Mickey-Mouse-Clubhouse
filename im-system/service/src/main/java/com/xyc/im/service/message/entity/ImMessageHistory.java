package com.xyc.im.service.message.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "im_message_history")
public class ImMessageHistory {
    @Id
    private Long id;
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
