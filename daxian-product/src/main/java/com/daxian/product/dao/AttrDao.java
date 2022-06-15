package com.daxian.product.dao;

import com.daxian.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
