package com.qsn.bootmongo.modules.controller;


import com.qsn.bootmongo.modules.entity.User;
import com.qsn.bootmongo.modules.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 获取用户信息的增删改查
 *
 * @author qiusn
 * @date 2020-05-08
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 获取用户集合
     */
    @RequestMapping("/list")
    public List<User> list() {
        return userService.list();
    }


    /**
     * 多增加几个用户
     */
    @RequestMapping("/save")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "插入用户成功";
    }

    /**
     * 通过名字查询
     */
    @RequestMapping("/getUserByName")
    public User getUserByName() {
        User user = userService.getByUserName("fdd2");
        return user;
    }

    /**
     * 通过相似名字查询（此查询结果只能有一个，否则查出多个结果会导致500）
     */
    @RequestMapping("/getUserByNameLike")
    public User getUserByNameLike() {
        User user = userService.getByUserNameLike("1");
        return user;
    }

    /**
     * 把1号名字改一下
     */
    @RequestMapping("/update")
    public String updateUser(@RequestBody  User user) {
        userService.updateUser(user);
        return "更新用户信息成功";
    }

    /**
     * 删除fdd0
     */
    @RequestMapping("/remove")
    public String removeUserByUserName(@RequestBody  User user) {
        userService.removeUserByUserName(user);
        return "删除用户成功";
    }



}
