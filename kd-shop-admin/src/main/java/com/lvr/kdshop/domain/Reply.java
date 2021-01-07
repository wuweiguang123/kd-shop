package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 评论回复对象 kd_reply
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public class Reply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long atuserId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long commetId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setAtuserId(Long atuserId) 
    {
        this.atuserId = atuserId;
    }

    public Long getAtuserId() 
    {
        return atuserId;
    }
    public void setCommetId(Long commetId) 
    {
        this.commetId = commetId;
    }

    public Long getCommetId() 
    {
        return commetId;
    }
    public void setCreateAt(String createAt) 
    {
        this.createAt = createAt;
    }

    public String getCreateAt() 
    {
        return createAt;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("atuserId", getAtuserId())
            .append("commetId", getCommetId())
            .append("createAt", getCreateAt())
            .append("content", getContent())
            .toString();
    }
}
