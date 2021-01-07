package com.lvr.kdshop.controller;

import com.alibaba.fastjson.JSONObject;
import com.lvr.common.core.controller.BaseController;
import com.lvr.common.core.domain.AjaxResult;
import com.lvr.common.utils.StringUtils;
import com.lvr.kdshop.domain.Carousel;
import com.lvr.kdshop.domain.Catelog;
import com.lvr.kdshop.domain.Goods;
import com.lvr.kdshop.service.ICarouselService;
import com.lvr.kdshop.service.ICatelogService;
import com.lvr.kdshop.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取科大商铺首页信息
 *
 * @author lvr1997
 * @date 2021/1/5
 */
@RestController
@RequestMapping("/")
public class HomeController extends BaseController {

    @Autowired
    private IGoodsService goodsService;

    @Autowired
    private ICatelogService catelogService;

    @Autowired
    private ICarouselService carouselService;

    @RequestMapping(value = "/getIndexData")
    public AjaxResult getIndexData(@RequestBody(required = false) Goods good) {
        //查询商品状态为 1 的
        Goods goods = null;
        if(good == null) {
            goods = new Goods();
            goods.setStatus(1);
        } else {
            good.setStatus(1);
        }

        Catelog catelog = new Catelog();
        catelog.setStatus(1);
        Carousel carousel = new Carousel();
        carousel.setStatus(1);
        List<Goods> goodsList = goodsService.selectGoodsList(good == null ? goods: good);
        List<Catelog> catelogList = catelogService.selectCatelogList(catelog);
        List<Carousel> carouselList = carouselService.selectCarouselList(carousel);

        Map<String, Object> resultMap = new HashMap();
        resultMap.put("goods", goodsList);
        resultMap.put("catelog", catelogList);
        resultMap.put("carousel", carouselList);

        return AjaxResult.success("请求成功", resultMap);
    }

}
