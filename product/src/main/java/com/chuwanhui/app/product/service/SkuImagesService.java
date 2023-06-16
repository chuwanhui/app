package com.chuwanhui.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chuwanhui.common.utils.PageUtils;
import com.chuwanhui.app.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chuwanhui
 * @email 911915851@qq.com
 * @date 2023-06-14 22:58:49
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

