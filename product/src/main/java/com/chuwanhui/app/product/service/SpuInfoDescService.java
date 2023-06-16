package com.chuwanhui.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chuwanhui.common.utils.PageUtils;
import com.chuwanhui.app.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chuwanhui
 * @email 911915851@qq.com
 * @date 2023-06-14 22:58:49
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

