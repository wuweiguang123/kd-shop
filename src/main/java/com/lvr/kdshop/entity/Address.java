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
public class Address extends Model<Address> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private String recvName;

    private String recvProvince;

    private String recvCity;

    private String recvArea;

    private String recvDistrict;

    private String recvAddr;

    private String recvPhone;

    private String recvTel;

    private String recvZip;

    private String recvTag;

    private Integer isDefault;

    private String createdUser;

    private String createdTime;

    private String modifiedUser;

    private String modifiedTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
