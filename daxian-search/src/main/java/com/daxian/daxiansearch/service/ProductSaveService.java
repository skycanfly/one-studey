package com.daxian.daxiansearch.service;

import com.daxian.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @Author: daxian
 * @Date: 2022/10/23 19:11
 */
public interface ProductSaveService {
    boolean saveProductAsIndices(List<SkuEsModel> skuEsModels) throws IOException;
}
