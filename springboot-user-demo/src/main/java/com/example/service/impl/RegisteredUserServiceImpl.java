package com.example.service.impl;

import com.example.service.RegisteredUserService;
import com.example.vo.request.UserInfoVO;
import org.springframework.stereotype.Service;

/**
 * @project: springBootBasis
 * @package: com.example.service.impl
 * @author: chenliang
 * @date: 8/28/18 13:45
 * @description:
 */
@Service
public class RegisteredUserServiceImpl implements RegisteredUserService {

    private final static int biz = 1;
    
    @Override
    public void createUser(UserInfoVO userInfoVO) {
        System.out.println("注册会员---------");
    }

    @Override
    public Boolean validate(int type) {
        return type == biz;
    }
}
