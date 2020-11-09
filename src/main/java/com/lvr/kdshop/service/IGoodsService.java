package com.lvr.kdshop.service;

import com.lvr.kdshop.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lvr.kdshop.entity.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
public interface IGoodsService extends IService<Goods> {

    List<GoodsVo> getGoodsAndImage();
}
