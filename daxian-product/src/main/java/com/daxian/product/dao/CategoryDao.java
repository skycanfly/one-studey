package com.daxian.product.dao;

import com.daxian.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
