package com.example.vo.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class UserInfoVO {

    private  String userId;
    
    private String name;
    
    private Integer age;
    
    private Integer type;

}
