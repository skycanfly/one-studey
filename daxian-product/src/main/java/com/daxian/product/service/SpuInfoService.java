package com.daxian.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

