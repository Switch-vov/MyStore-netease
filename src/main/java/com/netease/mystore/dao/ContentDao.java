package com.netease.mystore.dao;

import com.netease.mystore.domain.Content;

import java.util.List;

/**
 * 内容持久类接口
 * Created by switch on 16/11/14.
 */
public interface ContentDao {
    /**
     * 查找所有已购买商品
     *
     * @return
     */
    List<Content> findIsBuy();

    /**
     * 查找所有未购买商品
     *
     * @return
     */
    List<Content> findIsNotBuy();

    /**
     * 根据产品ID查询商品信息，其关联了订单信息
     * 如果有对应订单，则已经封装到record中
     * 如果没有对应订单，则record为null
     *
     * @param id
     * @return
     */
    Content findById(String id);

    /**
     * 获取内容数量
     *
     * @return
     */
    Integer findContentNum();

    /**
     * 保存内容
     *
     * @param content
     * @return
     */
    Integer save(Content content);

    /**
     * 更新内容
     *
     * @param content
     * @return
     */
    Integer update(Content content);

    /**
     * 通过ID删除内容
     * @param id
     * @return
     */
    Integer deleteById(String id);
}
