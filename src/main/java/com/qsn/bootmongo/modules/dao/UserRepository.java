package com.qsn.bootmongo.modules.dao;

import com.qsn.bootmongo.modules.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * dao层
 *
 * @author qiusn
 * @date 2020-05-21
 */
public interface UserRepository extends MongoRepository<User, Integer> {
    /**
     * 查询操作，自己定义实现
     *
     * @param name
     * @return
     */
    User getByName(String name);

    User getByNameLike(String name);
}