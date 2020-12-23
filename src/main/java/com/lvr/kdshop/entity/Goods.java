package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Data
public class Goods extends Model<Goods> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer catelogId;

    private Integer userId;

    private String name;

    private Double price;

    private Double realPrice;

    private String startTime;

    private String polishTime;

    private String endTime;

    private Integer commetNum;

    private String phoneNumber;

    private String qqNumber;

    private String wxNumber;

    private String goodCity;

    private String goodBuyMethod;

    private String goodAddress;

    /**
     * 排序字段
     */
    private Integer viewCount;

    private String describle;

    private Integer status;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
