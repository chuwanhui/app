package com.chuwanhui.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.chuwanhui.app.product.entity.AttrGroupEntity;
import com.chuwanhui.common.utils.PageUtils;


import java.util.Map;

/**
 * 属性分组
 *
 * @author chuwanhui
 * @email 911915851@qq.com
 * @date 2023-06-14 22:58:49
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

