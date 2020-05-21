package com.qsn.bootmongo.modules.service.impl;

import com.qsn.bootmongo.modules.dao.UserRepository;
import com.qsn.bootmongo.modules.entity.Shop;
import com.qsn.bootmongo.modules.entity.User;
import com.qsn.bootmongo.modules.service.UserService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * 用户信息的增删改查
 *
 * <p>
 * 使用MongoRepository
 * 使用Repository已经提供了基本的增删改查功能。 对于增加操作：要有主键才可以，并且不能是date日期类型的。 缺点是不够灵活
 * <p>
 * <p>
 * 使用MongoTemplate
 * Spring Data给我们提供了MongoTemplate类，是非常强大的，里面提供了大量的操作数据库的方法，而且是线程安全的
 * 针对不同的实体类，我们需要重复写不同的方法
 * <p>
 *
 * @author qiusn
 * @date 2020-05-08
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private UserRepository userRepository;


    /**
     * 获取集合
     */
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    /**
     * 通过用户名查询
     */
    @Override
    public User getByUserName(String name) {
        return userRepository.getByName(name);
    }

    /**
     * 通过相似用户名查询
     */
    @Override
    public User getByUserNameLike(String name) {
        return userRepository.getByNameLike(name);
    }

    /**
     * 新增
     */
    @Override
    public void saveUser(User user) {
        Shop shop = new Shop();
        shop.setShopName("超市名字");
        shop.setCreateTime(new Date());
        shop.setAddress("地址呀");
        mongoTemplate.save(shop);
        mongoTemplate.save(user);
    }

    /**
     * 通过用户id更新名字
     */
    @Override
    public void updateUser(User user) {
        Query q = new Query(new Criteria("id").is(user.getId()));
        Update update = new Update().set("name", user.getName());
        mongoTemplate.updateMulti(q, update, User.class);
    }

    /**
     * 通过用户名删除
     */
    @Override
    public void removeUserByUserName(User user) {
        Query query = new Query(new Criteria("id").is(user.getId()));
        mongoTemplate.remove(query, User.class);
    }


}
