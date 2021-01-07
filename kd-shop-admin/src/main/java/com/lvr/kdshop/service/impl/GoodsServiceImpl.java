package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.GoodsMapper;
import com.lvr.kdshop.domain.Goods;
import com.lvr.kdshop.service.IGoodsService;

/**
 * 商品Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class GoodsServiceImpl implements IGoodsService 
{
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 查询商品
     * 
     * @param id 商品ID
     * @return 商品
     */
    @Override
    public Goods selectGoodsById(Long id)
    {
        return goodsMapper.selectGoodsById(id);
    }

    /**
     * 查询商品列表
     * 
     * @param goods 商品
     * @return 商品
     */
    @Override
    public List<Goods> selectGoodsList(Goods goods)
    {
        return goodsMapper.selectGoodsList(goods);
    }

    /**
     * 新增商品
     * 
     * @param goods 商品
     * @return 结果
     */
    @Override
    public int insertGoods(Goods goods)
    {
        return goodsMapper.insertGoods(goods);
    }

    /**
     * 修改商品
     * 
     * @param goods 商品
     * @return 结果
     */
    @Override
    public int updateGoods(Goods goods)
    {
        return goodsMapper.updateGoods(goods);
    }

    /**
     * 批量删除商品
     * 
     * @param ids 需要删除的商品ID
     * @return 结果
     */
    @Override
    public int deleteGoodsByIds(Long[] ids)
    {
        return goodsMapper.deleteGoodsByIds(ids);
    }

    /**
     * 删除商品信息
     * 
     * @param id 商品ID
     * @return 结果
     */
    @Override
    public int deleteGoodsById(Long id)
    {
        return goodsMapper.deleteGoodsById(id);
    }
}
