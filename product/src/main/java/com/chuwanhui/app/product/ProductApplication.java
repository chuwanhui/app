package com.chuwanhui.app.product;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
@EnableTransactionManagement
public class ProductApplication {

    public static void main(String[] args) {

        /**
         * 整合myBatisPlus
         * 导入依赖
         *
         * 配置数据源
         * 配置myBatisPlus
         * 导入数据库的驱动
         *配置myBatisPlus使用mapperScan,告诉sql映射文件的位置
         */
        SpringApplication.run(ProductApplication.class, args);
    }

}
