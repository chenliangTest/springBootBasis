package com.example.service;

import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;

public interface UserTradeRecodeService {

    Result selectUserTradeList(UserTradeRecodeVO userTradeRecodeVO);
}
