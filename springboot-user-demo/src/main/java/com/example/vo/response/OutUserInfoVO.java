package com.example.vo.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class OutUserInfoVO implements Serializable{

    private Long id;

    private String userId;

    private String userName;

    private Integer age;

    private Date createTime;


}
