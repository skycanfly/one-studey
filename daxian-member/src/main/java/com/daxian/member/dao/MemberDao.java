package com.daxian.member.dao;

import com.daxian.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 22:53:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
