package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *  评论
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Data
public class Comments extends Model<Comments> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer goodsId;

    private String createAt;

    private String content;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
