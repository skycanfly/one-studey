package com.daxian.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 23:02:27
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

