package com.xyc.im.service.conversation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ImConversationSet {

    @Id
    private Long id;
    /**
     * 会话id 格式为 0_fromId_toId
     */
    private String conversationId;
    /**
     * 会话类型
     */
    private Integer conversationType;
    private String fromId;
    private String toId;
    private int inMute;
    private int isTop;

    private Long sequence;

    private Long readedSequence;

    private Integer appId;

}
