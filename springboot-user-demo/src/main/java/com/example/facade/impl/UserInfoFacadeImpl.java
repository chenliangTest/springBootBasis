package com.example.facade.impl;

import com.example.facade.UserInfoFacade;
import com.example.service.BaseUserService;
import com.example.service.UserInfoService;
import com.example.util.ResponseFactory;
import com.example.vo.Result;
import com.example.vo.request.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoFacadeImpl implements UserInfoFacade {

    @Autowired
    private UserInfoService userInfoService;
    
    @Autowired
    private List<BaseUserService> baseUserServiceList;
    
    @Override
    public Result selectUserInfoList(UserInfoVO userInfoVO) {
        return userInfoService.selectUserInfoList(userInfoVO);
    }

    @Override
    public Result selectUserTradeInfo(UserInfoVO userInfoVO) {
        return userInfoService.selectUserTradeInfo(userInfoVO);
    }

    @Override
    public Result createUserInfo(UserInfoVO userInfoVO) {

        Optional<BaseUserService> optional = baseUserServiceList.stream()
                .filter(service -> service.validate(userInfoVO.getType())).findFirst();
        if (!optional.isPresent()) {
            System.out.println("获取空对象");
        }

        BaseUserService customerService = optional.get();
        customerService.createUser(userInfoVO);
        
        return ResponseFactory.build(200);
    }
}
