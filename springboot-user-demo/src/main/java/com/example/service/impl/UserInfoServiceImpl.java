package com.example.service.impl;

import com.example.entity.UserInfo;
import com.example.entity.UserInfoExample;
import com.example.feignClient.TradeFeign;
import com.example.mapper.UserInfoMapper;
import com.example.service.UserInfoService;
import com.example.util.ResponseFactory;
import com.example.vo.Result;
import com.example.vo.request.UserInfoVO;
import com.example.vo.request.UserTradeRecodeVO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    TradeFeign tradeFeign;

    @Override
    public Result selectUserInfoList(UserInfoVO userInfoVO) {

        String userId = userInfoVO.getUserId();

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria createCriteria = userInfoExample.createCriteria();
        if (StringUtils.isNotBlank(userId)) {
            createCriteria.andUserIdEqualTo(userId);
        }

        List<UserInfo> list = userInfoMapper.selectByExample(userInfoExample);

        if (CollectionUtils.isNotEmpty(list)) {
            UserInfo userInfo = list.stream().findFirst().get();

        }

        return ResponseFactory.build(list);
    }


    @Override
    public Result selectUserTradeInfo(UserInfoVO userInfoVO) {

        UserTradeRecodeVO userTradeRecodeVO = new UserTradeRecodeVO();
        userTradeRecodeVO.setUserId(userInfoVO.getUserId());
        Result result = tradeFeign.selectUserTradeInfo(userTradeRecodeVO);
        return result;
    }
}
