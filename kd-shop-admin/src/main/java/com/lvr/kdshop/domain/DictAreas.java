package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 区域字典对象 kd_dict_areas
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public class DictAreas extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cityCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String areaCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String areaName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCityCode(String cityCode) 
    {
        this.cityCode = cityCode;
    }

    public String getCityCode() 
    {
        return cityCode;
    }
    public void setAreaCode(String areaCode) 
    {
        this.areaCode = areaCode;
    }

    public String getAreaCode() 
    {
        return areaCode;
    }
    public void setAreaName(String areaName) 
    {
        this.areaName = areaName;
    }

    public String getAreaName() 
    {
        return areaName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cityCode", getCityCode())
            .append("areaCode", getAreaCode())
            .append("areaName", getAreaName())
            .toString();
    }
}
