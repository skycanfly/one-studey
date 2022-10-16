package com.daxian.main;

import com.alibaba.fastjson.JSONObject;
import com.daxian.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: daxian
 * @Date: 2022/10/15 19:27
 */
public class HttpMain {
    public static void main(String[] args) {


        String userLogin = "http://localhost:8588/overview/overview";
        Map<String, Object> req = new HashMap<>();
        req.put("currentPage", "1");
        req.put("pageSize", "10");
        req.put("keyWord", "翟晶");
        Map<String, Object> post = HttpUtil.request(userLogin, req, "POST");
        String body = JSONObject.toJSONString(post);
        JSONObject data = JSONObject.parseObject(body).getJSONObject("data");
        String msg = data.getString("msg");
        String flag = data.getString("isSuccess");
    }
}
