package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 省份字典表对象 kd_dict_provinces
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public class DictProvinces extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String provinceCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String provinceName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProvinceCode(String provinceCode) 
    {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() 
    {
        return provinceCode;
    }
    public void setProvinceName(String provinceName) 
    {
        this.provinceName = provinceName;
    }

    public String getProvinceName() 
    {
        return provinceName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("provinceCode", getProvinceCode())
            .append("provinceName", getProvinceName())
            .toString();
    }
}
