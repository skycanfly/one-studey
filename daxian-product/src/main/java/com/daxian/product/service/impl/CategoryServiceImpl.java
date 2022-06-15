package com.daxian.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.daxian.common.utils.PageUtils;
import com.daxian.common.utils.Query;

import com.daxian.product.dao.CategoryDao;
import com.daxian.product.entity.CategoryEntity;
import com.daxian.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> collect = categoryEntities.stream().filter(x -> x.getParentCid() == 0)
                .map(a -> {
                    a.setCategoryEntityList(getChildrens(a, categoryEntities));
                    return a;
                })
                .sorted((x, y) -> {
                    return (x.getSort() == null ? 0 : x.getSort()) - (y.getSort() == null ? 0 : y.getSort());
                })
                .collect(Collectors.toList());

        return collect;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity a, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> collect = categoryEntities.stream().filter(x -> x.getParentCid() == a.getCatId())
                .map(b -> {
                    b.setCategoryEntityList(getChildrens(b, categoryEntities));
                    return b;
                })
                .sorted((x, y) -> {
                    return (x.getSort() == null ? 0 : x.getSort()) - (y.getSort() == null ? 0 : y.getSort());
                })
                .collect(Collectors.toList());
        return collect;
    }

}