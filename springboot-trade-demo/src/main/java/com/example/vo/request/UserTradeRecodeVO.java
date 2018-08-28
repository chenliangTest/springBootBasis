package com.example.vo.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString(callSuper = false)
public class UserTradeRecodeVO implements Serializable{

    private String userId;
}
