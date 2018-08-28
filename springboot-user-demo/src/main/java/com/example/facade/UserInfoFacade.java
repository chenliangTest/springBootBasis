package com.example.facade;

import com.example.vo.Result;
import com.example.vo.request.UserInfoVO;

public interface UserInfoFacade {

    Result selectUserInfoList(UserInfoVO userInfoVO);

    Result selectUserTradeInfo(UserInfoVO userInfoVO);
    
    Result createUserInfo(UserInfoVO userInfoVO);
}
