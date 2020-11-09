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
public class User extends Model<User> implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String phone;

    private String username;

    private String password;

    private String createAt;

    private Integer goodsNum;

    private Integer power;

    private String lastLogin;

    private Integer status;

    private String birthday;

    private String sex;

    private String imgUrl;

    private String residence;

    private String signature;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", phone=" + phone +
        ", username=" + username +
        ", password=" + password +
        ", createAt=" + createAt +
        ", goodsNum=" + goodsNum +
        ", power=" + power +
        ", lastLogin=" + lastLogin +
        ", status=" + status +
        ", birthday=" + birthday +
        ", sex=" + sex +
        ", imgUrl=" + imgUrl +
        ", residence=" + residence +
        ", signature=" + signature +
        "}";
    }
}
