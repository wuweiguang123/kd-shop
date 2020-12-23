package com.lvr.kdshop.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lvr.kdshop.entity.Carousel;
import com.lvr.kdshop.entity.Catelog;
import com.lvr.kdshop.entity.Goods;
import com.lvr.kdshop.entity.vo.GoodsVo;
import com.lvr.kdshop.service.ICarouselService;
import com.lvr.kdshop.service.ICatelogService;
import com.lvr.kdshop.service.IGoodsService;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    IGoodsService goodsService;

    @Autowired
    ICatelogService catelogService;

    @Autowired
    ICarouselService carouselService;

    /**
     * 首页显示商品，查询所有的商品，按照商品刷新时间排序
     * 左侧显示浏览量最多的商品数据，按照浏览数排序
     * 页显示分类数据，放入分类菜单
     * @return
     */
    @ResponseBody
    @RequestMapping("/getIndexData")
    public JSONResult getIndexData(){
        Map map = new HashMap();
        // 存放首页商品和图片信息
        List<GoodsVo> goodsVos = goodsService.getGoodsAndImage();
        List<Carousel> carousels = carouselService.list(new QueryWrapper<Carousel>().eq("status", 1));
        List<Catelog> catelogs = catelogService.list(new QueryWrapper<Catelog>().eq("status", 1));

        // 把数据存放到map里面返回
        map.put("goods", goodsVos);
        map.put("catelogs", catelogs);
        map.put("carousels", carousels);

        return JSONResult.success(map);
    }

    /**
     * 首页 根据分类查询
     * @param request
     * @param cid 分类id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/catelog/{id}")
    public JSONResult catelogGoods(HttpServletRequest request, @PathVariable("id") Integer cid) throws Exception {
        Map map = new HashMap();
        List<Goods> goods = goodsService.list(new QueryWrapper<Goods>().eq("catelog_id", cid).eq("status", 1));

        Catelog catelog = catelogService.getById(cid);
        List<Catelog> catelogs = catelogService.list(new QueryWrapper<Catelog>().eq("status", 1));
        List<GoodsVo> goodsAndImage = goodsService.getGoodsAndImage();

        map.put("goodsAndImage", goodsAndImage);
        map.put("catelogs", catelogs);
        map.put("catelog", catelog);

        return JSONResult.success(map);
    }

}
