package com.example.facade.impl;

import com.example.facade.UserInfoFacade;
import com.example.service.UserInfoService;
import com.example.vo.Result;
import com.example.vo.request.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoFacadeImpl implements UserInfoFacade {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public Result selectUserInfoList(UserInfoVO userInfoVO) {
        return userInfoService.selectUserInfoList(userInfoVO);
    }

    @Override
    public Result selectUserTradeInfo(UserInfoVO userInfoVO) {
        return userInfoService.selectUserTradeInfo(userInfoVO);
    }
}
