package com.xyc.im.service.message.entity;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "im_message_body")
public class ImMessageBody {
    private Integer appId;
    private Long messageKey;
    private String messageBody;
    private String securityKey;
    private Long messageTime;
    private Long createTime;
    private String extra;
    private Integer delFlag;
}
