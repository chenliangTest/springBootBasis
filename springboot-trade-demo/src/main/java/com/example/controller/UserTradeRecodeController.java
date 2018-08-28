package com.example.controller;

import com.example.facade.UserTradeRecodeFacade;
import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade")
public class UserTradeRecodeController {

    @Autowired
    UserTradeRecodeFacade userTradeRecodeFacade;

    @PostMapping("/getTradeInfo")
    public Result selectUserTradeRecodeList(@RequestBody UserTradeRecodeVO userTradeRecodeVO){
        return userTradeRecodeFacade.selectUserTradeList(userTradeRecodeVO);
    }
}
