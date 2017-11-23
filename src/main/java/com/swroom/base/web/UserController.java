package com.swroom.base.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Tsunglei Ching [ray@boyamarine.com]
 * @date 2017/11/22 21:18
 */
@RestController
public class UserController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + new Date();
    }

    @RequestMapping("/fuck")
    String netty() {
        return "wocao";
    }
}
