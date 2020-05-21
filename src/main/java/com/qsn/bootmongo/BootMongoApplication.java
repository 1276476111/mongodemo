package com.qsn.bootmongo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 此项目为 spring boot+mongo 项目
 * 尽量集合所有mongo坑， 做一个完美的mongo demo
 * 为日后的 spring boot/cloud 整合mongo做准备
 *
 * @author qiusn
 * @date 2020-05-08 17:23
 */

@SpringBootApplication
@EnableTransactionManagement
public class BootMongoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootMongoApplication.class);
        //关闭打印banner
        app.setBannerMode(Banner.Mode.OFF);
        // 启动
        app.run(args);
        System.out.println("------------------------------------------------欢迎------------------------------------------------");
    }

}
