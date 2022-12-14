//package com.daxian.daxiansearch.config;
//
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author: daxian
// * @Date: 2022/10/16 22:19
// */
//@Configuration
//public class EsConfig {
//    @Bean
//    public RestHighLevelClient restHighLevelClient() {
//        RestHighLevelClient client = new RestHighLevelClient(
//                RestClient.builder(
//                        new HttpHost("localhost", 9200, "http")));
//        return client;
//    }
//    public static final RequestOptions COMMON_OPTIONS;
//    static {
//        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
////        builder.addHeader("Authorization", "Bearer " + TOKEN);
////        builder.setHttpAsyncResponseConsumerFactory(
////                new HttpAsyncResponseConsumerFactory
////                        .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));
//        COMMON_OPTIONS = builder.build();
//    }
//}
