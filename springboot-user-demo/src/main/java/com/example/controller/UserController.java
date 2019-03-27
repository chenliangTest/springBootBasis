package com.example.controller;

import com.example.facade.UserInfoFacade;
import com.example.vo.Result;
import com.example.vo.request.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiuser")
public class UserController {

    @Autowired
    UserInfoFacade userInfoFacade;

    @PostMapping(value = "/getUserList")
    public Result selectUserInfo(@RequestBody UserInfoVO userInfoVO) {
        return userInfoFacade.selectUserInfoList(userInfoVO);
    }

    @PostMapping(value = "/getUserTradeList")
    public Result selectUserTradeInfo(@RequestBody UserInfoVO userInfoVO){
        return userInfoFacade.selectUserTradeInfo(userInfoVO);
    }
    
    @PostMapping(value = "/createUserInfo")
    public Result createUserInfo(@RequestBody UserInfoVO userInfoVO){
        return userInfoFacade.createUserInfo(userInfoVO);
    }
}
