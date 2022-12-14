package com.daxian.product.service.impl;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Cacheable(value = "category" )
    @Override
    public List<CategoryEntity> queryTree() {
        System.out.println(111);
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

//    public Map<String, List<CategoryEntity>> getCatalogJsonDbWithRedisson() {
//        Map<String, List<CategoryEntity>> categoryMap=null;
//        RLock lock = redissonClient.getLock("CatalogJson-Lock");
//        lock.lock(10, TimeUnit.SECONDS);
//        try {
//            Thread.sleep(15000);
//            categoryMap = getCategoryMap();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//            return categoryMap;
//        }
//    }

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