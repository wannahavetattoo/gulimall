package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lilinze
 * @email 302884999@qq.com
 * @date 2022-03-13 19:23:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
