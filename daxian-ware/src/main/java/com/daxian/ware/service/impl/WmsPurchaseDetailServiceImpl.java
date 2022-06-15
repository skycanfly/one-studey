package com.daxian.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.daxian.common.utils.PageUtils;
import com.daxian.common.utils.Query;

import com.daxian.ware.dao.WmsPurchaseDetailDao;
import com.daxian.ware.entity.WmsPurchaseDetailEntity;
import com.daxian.ware.service.WmsPurchaseDetailService;


@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl extends ServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetailEntity> implements WmsPurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsPurchaseDetailEntity> page = this.page(
                new Query<WmsPurchaseDetailEntity>().getPage(params),
                new QueryWrapper<WmsPurchaseDetailEntity>()
        );

        return new PageUtils(page);
    }

}