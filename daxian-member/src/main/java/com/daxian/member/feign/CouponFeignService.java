package com.daxian.member.feign;

import com.daxian.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: daxian
 * @Date: 2022/6/12 14:47
 */
@FeignClient("daxian-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/list")
     R membercoupons();
}
