package com.daxian.daxiansearch;


import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.alibaba.fastjson.JSON;
import com.daxian.daxiansearch.bean.Document;
import com.daxian.daxiansearch.mapper.DocumentMapper;
import lombok.Data;
import lombok.ToString;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.Avg;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaxianSearchApplicationTests {
    @Autowired
    private DocumentMapper documentMapper;
    @Test
    public void testInsert() {
        // 测试插入数据
        Document document = new Document();
        document.setTitle("test title");
        document.setContent("test content");
        int successCount = documentMapper.insert(document);
        System.out.println(successCount);
    }
    @Test
    public void testSelect() {
        // 测试查询
        String title = "test title";
        LambdaEsQueryWrapper<Document> wrapper = new LambdaEsQueryWrapper<>();
        wrapper.eq(Document::getTitle,title);
        Document document = documentMapper.selectOne(wrapper);
        System.out.println(document);
        Assert.assertEquals(title,document.getTitle());
    }


}
