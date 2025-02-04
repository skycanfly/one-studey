package com.daxian.daxiansearch.bean;

import lombok.Data;

/**
 * @Author: daxian
 * @Date: 2022/11/13 21:01
 */
@Data
public class Document {
    /**
     * es中的唯一id
     */
    private String id;
    /**
     * 文档标题
     */
    private String title;
    /**
     * 文档内容
     */
    private String content;
}
