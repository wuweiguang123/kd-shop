package com.lvr.kdshop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lvr.kdshop.entity.Goods;
import com.lvr.kdshop.entity.Image;
import com.lvr.kdshop.entity.vo.GoodsVo;
import com.lvr.kdshop.mapper.GoodsMapper;
import com.lvr.kdshop.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvr.kdshop.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private IImageService imageService;

    @Override
    public List<GoodsVo> getGoodsAndImage() {
        List<GoodsVo> goodsVos = new ArrayList<>();
        // 查询出所有商品
        List<Goods> goods = this.list(new QueryWrapper<Goods>().eq("status", 1).orderByDesc("view_count"));
        // 处理商品与图片的关联
        for (int i = 0; i < goods.size(); i++) {
            GoodsVo goodsVo = new GoodsVo();
            Goods good = goods.get(i);
            List<Image> images = imageService.list(new QueryWrapper<Image>().eq("goods_id", good.getId()));
            goodsVo.setGood(good);
            goodsVo.setImages(images);
            goodsVos.add(i, goodsVo);
        }
        return goodsVos;
    }
}
