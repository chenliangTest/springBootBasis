package com.example.service.impl;

import com.example.entity.UserTradeRecode;
import com.example.entity.UserTradeRecodeExample;
import com.example.mapper.UserTradeRecodeMapper;
import com.example.service.UserTradeRecodeService;
import com.example.util.ResponseFactory;
import com.example.vo.Result;
import com.example.vo.request.UserTradeRecodeVO;
import com.sun.xml.internal.txw2.output.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTradeRecodeServiceImpl implements UserTradeRecodeService {

    @Autowired
    UserTradeRecodeMapper userTradeRecodeMapper;

    @Override
    public Result selectUserTradeList(UserTradeRecodeVO userTradeRecodeVO) {

        String userId = userTradeRecodeVO.getUserId();

        UserTradeRecodeExample userTradeRecodeExample = new UserTradeRecodeExample();
        userTradeRecodeExample.createCriteria().andUserIdEqualTo(userId);

        List<UserTradeRecode> list = userTradeRecodeMapper.selectByExample(userTradeRecodeExample);

        return ResponseFactory.build(list);
    }
}
