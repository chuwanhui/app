package com.chuwanhui.app.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.chuwanhui.app.product.entity.AttrAttrgroupRelationEntity;
import com.chuwanhui.common.utils.PageUtils;


import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chuwanhui
 * @email 911915851@qq.com
 * @date 2023-06-14 22:58:49
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

