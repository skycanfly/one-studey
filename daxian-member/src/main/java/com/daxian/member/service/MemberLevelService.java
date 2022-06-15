package com.daxian.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 22:53:02
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

