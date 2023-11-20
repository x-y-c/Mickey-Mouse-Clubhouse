package com.xyc.im.service.group;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "im_group_message_history")
public class ImGroupMessageHistory {
    @Id
    private Long id;
    private Integer appId;
    private String fromId;
    private String groupId;
    private Long messageKey;

    private Long sequence;
    private String messageRandom;

    private Long messageTime;
    private Long createTime;
}
