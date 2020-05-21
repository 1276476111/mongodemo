package com.qsn.bootmongo.modules.service;


import com.qsn.bootmongo.modules.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 获取用户信息的增删改查
 *
 * @author qiusn
 * @date 2020-05-08
 */

@Service
public interface UserService {

    /**
     * 获取用户集合
     *
     * @return 集合信息
     * @author qiusn
     * @date 2020-05-21
     */
    List<User> list();

    /**
     * 新增
     *
     * @param user 用户信息
     * @author qiusn
     * @date 2020-05-21
     */
    void saveUser(User user);

    /**
     * 通过用户名查询
     *
     * @param name 用户名
     * @return 用户信息
     * @author qiusn
     * @date 2020-05-21
     */
    User getByUserName(String name);

    /**
     * 通过相似用户名查询（此查询结果只能有一个，否则查出多个结果会导致500）
     *
     * @param name 用户名
     * @return 用户信息
     * @author qiusn
     * @date 2020-05-21
     */
    User getByUserNameLike(String name);

    /**
     * 删除
     *
     * @param user 主键
     * @author qiusn
     * @date 2020-05-08
     */
    void removeUserByUserName(User user);

    /**
     * 通过用户id更新名字
     *
     * @param user 用户信息
     * @author qiusn
     * @date 2020-05-21
     */
    void updateUser(User user);




}
