package com.chuwanhui.app.product;

import com.chuwanhui.app.product.dao.BrandDao;
import com.chuwanhui.app.product.entity.BrandEntity;
import com.chuwanhui.app.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {


    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("huawei");
        brandService.save(brand);
        System.out.println("保存测试");
    }

}
