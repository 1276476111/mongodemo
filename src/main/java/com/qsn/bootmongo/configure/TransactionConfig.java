package com.qsn.bootmongo.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 事务配置
 *
 * 注：
 * mongo储存单个文档具有原子性， 单例的mongo不支持事务， 集群才支持
 *
 * mongo在4.0版本中，MongoDB支持副本集（集群）上的多文档事务
 * mongo在4.2版本中，MongoDB引入了分布式事务
 *
 * @author qiusn
 * @date 2020-05-21
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfig {

    @Bean
    MongoTransactionManager transactionManager(MongoDbFactory mongoDbFactory) {
        return new MongoTransactionManager(mongoDbFactory);
    }
}
