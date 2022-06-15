package com.daxian.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 21:15:49
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

