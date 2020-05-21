package com.qsn.bootmongo.configure.incId;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * id的自增进度需要一个数据表存储
 *
 * @author qiusn
 * @date 2020-05-21
 */
@Getter
@Setter
@Document(collection = "inc")
public class IncInfo {

    /**
     * 对应数据库的主键id
     */
    @Id
    private String id;

    /**
     * 需要自增id的集合名称(这里设置为MyDomain)
     */
    @Field
    private String collName;

    /**
     * 当前自增id值
     */
    @Field
    private Long incId;

}