package com.daxian.util;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


import java.io.IOException;
import java.util.Map;

public class HttpUtil {
    private static CloseableHttpClient httpClient = HttpClients.custom().build();
    private static RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(2000000).
            setSocketTimeout(2000000).build();


    private static String fillUrlWithParams(String url, Map<String, Object> params) {
        String fullUrl = url + "?";
        if (params != null && params.size() > 0) {
            for (Map.Entry<String, Object> param : params.entrySet()) {
                fullUrl += (param.getKey() + "=" + param.getValue().toString());
                fullUrl += "&";
            }
        }
        return fullUrl.substring(0, fullUrl.length() -1);
    }

    public static Map<String, Object> request(String url, Map<String, Object> params, String method) {
        if (url == null || url.length() == 0) {
            return null;
        }

        HttpRequestBase req = null;
        if (method.compareToIgnoreCase("GET") == 0) {
            req = new HttpGet(fillUrlWithParams(url, params));
        } else if (method.compareToIgnoreCase("POST") == 0) {
            req = new HttpPost(url);
            String entityJson = params == null || params.size() == 0 ? null : JSON.toJSONString(params);
            if (entityJson != null) {
                ((HttpPost) req).setEntity(new StringEntity(entityJson, "UTF-8"));
            }
        } else if (method.compareToIgnoreCase("DELETE") == 0) {
            req = new HttpDelete(fillUrlWithParams(url, params));
        }

        req.setConfig(requestConfig);
        req.setHeader("Content-Type", "application/json;charset=UTF-8");

        try {
            CloseableHttpResponse response = httpClient.execute(req);
            return (Map<String, Object>) JSON.parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
