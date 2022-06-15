package com.daxian.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

