package com.xyc.im.service.user;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "im_user_data")
public class ImUserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String userId;
    private Integer appId;
    private String nickName;
    private Integer userSex;
    private Date birthDay;
    private String location;
    private String selfSignature;
    private Integer friendAllowType;
    private String photo;
    private String password;
    private Integer disableAddFriend;
    private Integer silentFlag;
    private Integer forbiddenFlag;
    private Integer userType;
    private Integer delFlag;
    private String extra;

}
