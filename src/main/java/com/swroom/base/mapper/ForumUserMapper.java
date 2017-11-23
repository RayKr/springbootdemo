package com.swroom.base.mapper;

import com.swroom.base.model.po.ForumUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ForumUserMapper extends Mapper<ForumUser> {
}