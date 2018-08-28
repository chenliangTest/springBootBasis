package com.example.util;

import com.alibaba.fastjson.JSONObject;
import com.example.vo.Result;

public class ResponseFactory {

    public static Result build(Object o){

        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(JSONObject.toJSONString(o));

        return result;
    }
}
