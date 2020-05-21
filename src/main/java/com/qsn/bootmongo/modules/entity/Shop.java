package com.qsn.bootmongo.modules.entity;


import com.qsn.bootmongo.configure.incId.AutoInc;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * 商店
 *
 * @author qiusn
 * @date 2020-05-21
 */
@Getter
@Setter
@ToString
@Document(collection = "shop")
public class Shop {

    @Id
    @AutoInc
    private long id;

    private String shopName;

    private String address;

    private Date createTime;


}
