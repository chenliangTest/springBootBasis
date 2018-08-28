package com.example.facade.impl;

import com.example.facade.UserTradeRecodeFacade;
import com.example.service.UserTradeRecodeService;
import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTradeRecodeFacadeImpl implements UserTradeRecodeFacade {

    @Autowired
    UserTradeRecodeService userTradeRecodeService;

    @Override
    public Result selectUserTradeList(UserTradeRecodeVO userTradeRecodeVO) {
        return userTradeRecodeService.selectUserTradeList(userTradeRecodeVO);
    }
}
