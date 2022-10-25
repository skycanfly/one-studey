package com.daxian.product.feign;

import com.daxian.common.to.SkuHasStockVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: daxian
 * @Date: 2022/10/23 17:57
 */
@FeignClient("daxian-ware")
public interface WareFeignService {
    @RequestMapping("/ware/waresku/getSkuHasStocks")
    List<SkuHasStockVo> getSkuHasStocks(@RequestBody List<Long> ids);
}
