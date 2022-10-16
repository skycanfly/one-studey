package com.daxian.product.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.daxian.common.utils.PageUtils;
import com.daxian.common.utils.Query;

import com.daxian.product.dao.AttrGroupDao;
import com.daxian.product.entity.AttrGroupEntity;
import com.daxian.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params,Long catelogId) {

        QueryWrapper<AttrGroupEntity> queryWrapper = new QueryWrapper<>();
        //select * from pms_attr_group where catelog_id=? and (attr_group_id=key or attr_group_name like %key%)
        if (catelogId!=0){
            queryWrapper.eq("catelog_id", catelogId);
        }

        String key = (String) params.get("key");
        if (!StringUtils.isEmpty(key)){
            queryWrapper.and((obj)->
                    obj.eq("attr_group_id",key).or().like("attr_group_name",key));
        }
        IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params), queryWrapper);
        return new PageUtils(page);
    }

}