package com.example.facade;

import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;

public interface UserTradeRecodeFacade {

    Result selectUserTradeList(UserTradeRecodeVO userTradeRecodeVO);
}
