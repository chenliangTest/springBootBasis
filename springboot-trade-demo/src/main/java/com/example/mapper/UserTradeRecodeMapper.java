package com.example.mapper;

import com.example.entity.UserTradeRecode;
import com.example.entity.UserTradeRecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTradeRecodeMapper {
    int countByExample(UserTradeRecodeExample example);

    int deleteByExample(UserTradeRecodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTradeRecode record);

    int insertSelective(UserTradeRecode record);

    List<UserTradeRecode> selectByExample(UserTradeRecodeExample example);

    UserTradeRecode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTradeRecode record, @Param("example") UserTradeRecodeExample example);

    int updateByExample(@Param("record") UserTradeRecode record, @Param("example") UserTradeRecodeExample example);

    int updateByPrimaryKeySelective(UserTradeRecode record);

    int updateByPrimaryKey(UserTradeRecode record);
}