package com.daxian.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.daxian.ware.entity.WareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:15:25
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
