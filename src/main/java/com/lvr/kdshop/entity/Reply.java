package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Reply extends Model<Reply> {

    private static final long serialVersionUID=1L;

      private Integer id;

    private Integer userId;

    private Integer atuserId;

    private Integer commetId;

    private String createAt;

    private String content;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
