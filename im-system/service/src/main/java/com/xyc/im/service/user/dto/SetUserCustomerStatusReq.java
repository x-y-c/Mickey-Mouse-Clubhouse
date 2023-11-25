package com.xyc.im.service.user.dto;

import lombok.Data;

@Data
public class SetUserCustomerStatusReq {
    private String userId;
    private String customText;
    private Integer customStatus;
}
