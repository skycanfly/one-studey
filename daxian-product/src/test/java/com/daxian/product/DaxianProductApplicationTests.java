package com.daxian.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.daxian.product.entity.BrandEntity;
import com.daxian.product.service.BrandService;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DaxianProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为手机的描述修改");
        brandEntity.setName("华为mate");
        brandService.save(brandEntity);
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 2L));
//        list.forEach((x)-> System.out.println(x));
    }

}
