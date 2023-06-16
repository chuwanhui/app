package com.chuwanhui.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chuwanhui.common.utils.PageUtils;
import com.chuwanhui.app.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author chuwanhui
 * @email 911915851@qq.com
 * @date 2023-06-14 22:58:49
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

