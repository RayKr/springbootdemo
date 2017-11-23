package com.swroom.base.service;

import com.swroom.base.model.po.ForumUser;

/**
 * @author Tsunglei Ching [ray@boyamarine.com]
 * @date 2017/11/22 20:53
 */
public interface UserService {

    ForumUser selectUser(Long userId);
}
