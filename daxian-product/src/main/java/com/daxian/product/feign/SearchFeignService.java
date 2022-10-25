package com.daxian.product.feign;

import com.daxian.common.to.es.SkuEsModel;
import com.daxian.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author: daxian
 * @Date: 2022/10/23 19:05
 */
@FeignClient("daxian-search")
public interface SearchFeignService {
    @PostMapping("/product")
    R saveProductAsIndices(@RequestBody List<SkuEsModel> skuEsModels);
}
