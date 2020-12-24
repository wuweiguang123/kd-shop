package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 收件地址对象 kd_address
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public class Address extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 收件人姓名 */
    @Excel(name = "收件人姓名")
    private String recvName;

    /** 收件人省份 */
    @Excel(name = "收件人省份")
    private String recvProvince;

    /** 收件人城市 */
    @Excel(name = "收件人城市")
    private String recvCity;

    /** 收件人所在区 */
    @Excel(name = "收件人所在区")
    private String recvArea;

    /** 收件人地名 */
    @Excel(name = "收件人地名")
    private String recvDistrict;

    /** 收件人地址 */
    @Excel(name = "收件人地址")
    private String recvAddr;

    /** 收件人电话 */
    @Excel(name = "收件人电话")
    private String recvPhone;

    /** 收件人固定电话 */
    @Excel(name = "收件人固定电话")
    private String recvTel;

    /** 邮编 */
    @Excel(name = "邮编")
    private String recvZip;

    /** 标签 */
    @Excel(name = "标签")
    private String recvTag;

    /** 是否默认 */
    @Excel(name = "是否默认")
    private Long isDefault;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdUser;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private String createdTime;

    /** 修改人 */
    @Excel(name = "修改人")
    private String modifiedUser;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private String modifiedTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setRecvName(String recvName) 
    {
        this.recvName = recvName;
    }

    public String getRecvName() 
    {
        return recvName;
    }
    public void setRecvProvince(String recvProvince) 
    {
        this.recvProvince = recvProvince;
    }

    public String getRecvProvince() 
    {
        return recvProvince;
    }
    public void setRecvCity(String recvCity) 
    {
        this.recvCity = recvCity;
    }

    public String getRecvCity() 
    {
        return recvCity;
    }
    public void setRecvArea(String recvArea) 
    {
        this.recvArea = recvArea;
    }

    public String getRecvArea() 
    {
        return recvArea;
    }
    public void setRecvDistrict(String recvDistrict) 
    {
        this.recvDistrict = recvDistrict;
    }

    public String getRecvDistrict() 
    {
        return recvDistrict;
    }
    public void setRecvAddr(String recvAddr) 
    {
        this.recvAddr = recvAddr;
    }

    public String getRecvAddr() 
    {
        return recvAddr;
    }
    public void setRecvPhone(String recvPhone) 
    {
        this.recvPhone = recvPhone;
    }

    public String getRecvPhone() 
    {
        return recvPhone;
    }
    public void setRecvTel(String recvTel) 
    {
        this.recvTel = recvTel;
    }

    public String getRecvTel() 
    {
        return recvTel;
    }
    public void setRecvZip(String recvZip) 
    {
        this.recvZip = recvZip;
    }

    public String getRecvZip() 
    {
        return recvZip;
    }
    public void setRecvTag(String recvTag) 
    {
        this.recvTag = recvTag;
    }

    public String getRecvTag() 
    {
        return recvTag;
    }
    public void setIsDefault(Long isDefault) 
    {
        this.isDefault = isDefault;
    }

    public Long getIsDefault() 
    {
        return isDefault;
    }
    public void setCreatedUser(String createdUser) 
    {
        this.createdUser = createdUser;
    }

    public String getCreatedUser() 
    {
        return createdUser;
    }
    public void setCreatedTime(String createdTime) 
    {
        this.createdTime = createdTime;
    }

    public String getCreatedTime() 
    {
        return createdTime;
    }
    public void setModifiedUser(String modifiedUser) 
    {
        this.modifiedUser = modifiedUser;
    }

    public String getModifiedUser() 
    {
        return modifiedUser;
    }
    public void setModifiedTime(String modifiedTime) 
    {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedTime() 
    {
        return modifiedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("recvName", getRecvName())
            .append("recvProvince", getRecvProvince())
            .append("recvCity", getRecvCity())
            .append("recvArea", getRecvArea())
            .append("recvDistrict", getRecvDistrict())
            .append("recvAddr", getRecvAddr())
            .append("recvPhone", getRecvPhone())
            .append("recvTel", getRecvTel())
            .append("recvZip", getRecvZip())
            .append("recvTag", getRecvTag())
            .append("isDefault", getIsDefault())
            .append("createdUser", getCreatedUser())
            .append("createdTime", getCreatedTime())
            .append("modifiedUser", getModifiedUser())
            .append("modifiedTime", getModifiedTime())
            .toString();
    }
}
