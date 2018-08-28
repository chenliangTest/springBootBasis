package com.example.feignClient;

import com.example.feignClient.impl.TradeFeignImpl;
import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "trade" , fallbackFactory = TradeFeignImpl.class)
public interface TradeFeign {

    @PostMapping(value = "/trade/getTradeInfo")
    Result selectUserTradeInfo(UserTradeRecodeVO userTradeRecodeVO);
}
