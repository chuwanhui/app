package com.chuwanhui.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chuwanhui.common.utils.PageUtils;
import com.chuwanhui.app.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author chuwanhui
 * @email 911915851@qq.com
 * @date 2023-06-14 22:58:49
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

