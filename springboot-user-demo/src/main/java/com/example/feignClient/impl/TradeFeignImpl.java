package com.example.feignClient.impl;

import com.example.feignClient.TradeFeign;
import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;
import org.springframework.stereotype.Service;

@Service
public class TradeFeignImpl implements TradeFeign {

    @Override
    public Result selectUserTradeInfo(UserTradeRecodeVO userTradeRecodeVO) {

        Result result = new Result();
        result.setCode(100);
        result.setMsg("交易服务异常");
        result.setData(null);
        return result;
    }
}
