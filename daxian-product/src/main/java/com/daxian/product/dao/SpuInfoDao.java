package com.daxian.product.dao;

import com.daxian.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu信息
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-10 23:58:26
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void upSpuStatus(Long spuId, int code);
}
