package com.daxian.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 23:08:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

