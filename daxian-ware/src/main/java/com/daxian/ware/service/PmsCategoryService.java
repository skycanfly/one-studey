package com.daxian.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.ware.entity.PmsCategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 23:08:31
 */
public interface PmsCategoryService extends IService<PmsCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

