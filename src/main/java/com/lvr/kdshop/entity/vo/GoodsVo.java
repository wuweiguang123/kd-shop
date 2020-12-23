package com.lvr.kdshop.entity.vo;

import com.lvr.kdshop.entity.Goods;
import com.lvr.kdshop.entity.Image;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class GoodsVo {

    private Goods good;
    private List<Image> images;

}
