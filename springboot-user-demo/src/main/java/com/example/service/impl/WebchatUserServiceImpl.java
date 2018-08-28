package com.example.service.impl;

import com.example.service.WebchatUserService;
import com.example.vo.request.UserInfoVO;
import org.springframework.stereotype.Service;

/**
 * @project: springBootBasis
 * @package: com.example.service.impl
 * @author: chenliang
 * @date: 8/28/18 13:44
 * @description:
 */
@Service
public class WebchatUserServiceImpl implements WebchatUserService {

    private final static int biz = 2;
    
    @Override
    public void createUser(UserInfoVO userInfoVO) {
        System.out.println("微信注册------");
    }

    @Override
    public Boolean validate(int type) {
        return type == biz;
    }
}
