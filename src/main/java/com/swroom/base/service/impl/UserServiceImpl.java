package com.swroom.base.service.impl;

import com.swroom.base.mapper.ForumUserMapper;
import com.swroom.base.model.po.ForumUser;
import com.swroom.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tsunglei Ching [ray@boyamarine.com]
 * @date 2017/11/22 20:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ForumUserMapper forumUserMapper;

    @Transactional
    @Override
    public ForumUser selectUser(Long userId) {
        return forumUserMapper.selectByPrimaryKey(1L);
    }
}
