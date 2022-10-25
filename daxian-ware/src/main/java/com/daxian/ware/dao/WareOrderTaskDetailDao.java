package com.daxian.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.daxian.ware.entity.WareOrderTaskDetailEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:15:25
 */
@Mapper
public interface WareOrderTaskDetailDao extends BaseMapper<WareOrderTaskDetailEntity> {
	
}
