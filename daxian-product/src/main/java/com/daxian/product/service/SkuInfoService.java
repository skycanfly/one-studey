package com.daxian.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

