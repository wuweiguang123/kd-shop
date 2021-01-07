package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 商品对象 kd_goods
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public class Goods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long catelogId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long realPrice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String polishTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long commetNum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phoneNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qqNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String wxNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodCity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodBuyMethod;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodAddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long viewcount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String describle;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCatelogId(Long catelogId) 
    {
        this.catelogId = catelogId;
    }

    public Long getCatelogId() 
    {
        return catelogId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setRealPrice(Long realPrice) 
    {
        this.realPrice = realPrice;
    }

    public Long getRealPrice() 
    {
        return realPrice;
    }
    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public String getStartTime() 
    {
        return startTime;
    }
    public void setPolishTime(String polishTime) 
    {
        this.polishTime = polishTime;
    }

    public String getPolishTime() 
    {
        return polishTime;
    }
    public void setEndTime(String endTime) 
    {
        this.endTime = endTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }
    public void setCommetNum(Long commetNum) 
    {
        this.commetNum = commetNum;
    }

    public Long getCommetNum() 
    {
        return commetNum;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setQqNumber(String qqNumber) 
    {
        this.qqNumber = qqNumber;
    }

    public String getQqNumber() 
    {
        return qqNumber;
    }
    public void setWxNumber(String wxNumber) 
    {
        this.wxNumber = wxNumber;
    }

    public String getWxNumber() 
    {
        return wxNumber;
    }
    public void setGoodCity(String goodCity) 
    {
        this.goodCity = goodCity;
    }

    public String getGoodCity() 
    {
        return goodCity;
    }
    public void setGoodBuyMethod(String goodBuyMethod) 
    {
        this.goodBuyMethod = goodBuyMethod;
    }

    public String getGoodBuyMethod() 
    {
        return goodBuyMethod;
    }
    public void setGoodAddress(String goodAddress) 
    {
        this.goodAddress = goodAddress;
    }

    public String getGoodAddress() 
    {
        return goodAddress;
    }
    public void setViewcount(Long viewcount) 
    {
        this.viewcount = viewcount;
    }

    public Long getViewcount() 
    {
        return viewcount;
    }
    public void setDescrible(String describle) 
    {
        this.describle = describle;
    }

    public String getDescrible() 
    {
        return describle;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("catelogId", getCatelogId())
            .append("userId", getUserId())
            .append("name", getName())
            .append("price", getPrice())
            .append("realPrice", getRealPrice())
            .append("startTime", getStartTime())
            .append("polishTime", getPolishTime())
            .append("endTime", getEndTime())
            .append("commetNum", getCommetNum())
            .append("phoneNumber", getPhoneNumber())
            .append("qqNumber", getQqNumber())
            .append("wxNumber", getWxNumber())
            .append("goodCity", getGoodCity())
            .append("goodBuyMethod", getGoodBuyMethod())
            .append("goodAddress", getGoodAddress())
            .append("viewcount", getViewcount())
            .append("describle", getDescrible())
            .append("status", getStatus())
            .toString();
    }
}
