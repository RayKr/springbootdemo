package com.swroom.base.service.impl;

import com.swroom.base.model.po.ForumUser;
import com.swroom.base.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Tsunglei Ching [ray@boyamarine.com]
 * @date 2017/11/23 8:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void selectUser() throws Exception {

        ForumUser forumUser = userService.selectUser(1L);
        System.out.println(forumUser.toString());

    }

}