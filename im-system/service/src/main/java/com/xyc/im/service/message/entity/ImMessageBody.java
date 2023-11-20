package com.xyc.im.service.message.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.core.annotation.Order;

@Entity
@Data
@Table(name = "im_message_body")
public class ImMessageBody {
    @Id
    private Long id;
    private Integer appId;
    private Long messageKey;
    private String messageBody;
    private String securityKey;
    private Long messageTime;
    private Long createTime;
    private String extra;
    private Integer delFlag;
}
