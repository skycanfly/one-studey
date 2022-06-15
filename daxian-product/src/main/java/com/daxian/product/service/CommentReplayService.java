package com.daxian.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

