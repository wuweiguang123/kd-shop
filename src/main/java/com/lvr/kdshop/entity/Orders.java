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
public class Orders extends Model<Orders> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String orderId;

    private Integer userId;

    private Integer goodId;

    private Integer addressId;

    private String payId;

    private String createAt;

    private Integer status;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
