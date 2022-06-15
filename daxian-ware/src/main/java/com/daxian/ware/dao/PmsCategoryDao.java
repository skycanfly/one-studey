package com.daxian.ware.dao;

import com.daxian.ware.entity.PmsCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 23:08:31
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<PmsCategoryEntity> {
	
}
