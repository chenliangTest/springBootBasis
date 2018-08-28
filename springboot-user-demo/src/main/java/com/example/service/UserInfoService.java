package com.example.service;

import com.example.vo.Result;
import com.example.vo.request.UserInfoVO;

public interface UserInfoService {

    Result selectUserInfoList(UserInfoVO userInfoVO);

    Result selectUserTradeInfo(UserInfoVO userInfoVO);
}
