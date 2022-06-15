package com.daxian.member.dao;

import com.daxian.member.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 22:53:02
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {
	
}
