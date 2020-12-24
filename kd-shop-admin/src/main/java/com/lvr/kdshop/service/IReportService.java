package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Report;

/**
 * 投诉Service接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface IReportService 
{
    /**
     * 查询投诉
     * 
     * @param id 投诉ID
     * @return 投诉
     */
    public Report selectReportById(Long id);

    /**
     * 查询投诉列表
     * 
     * @param report 投诉
     * @return 投诉集合
     */
    public List<Report> selectReportList(Report report);

    /**
     * 新增投诉
     * 
     * @param report 投诉
     * @return 结果
     */
    public int insertReport(Report report);

    /**
     * 修改投诉
     * 
     * @param report 投诉
     * @return 结果
     */
    public int updateReport(Report report);

    /**
     * 批量删除投诉
     * 
     * @param ids 需要删除的投诉ID
     * @return 结果
     */
    public int deleteReportByIds(Long[] ids);

    /**
     * 删除投诉信息
     * 
     * @param id 投诉ID
     * @return 结果
     */
    public int deleteReportById(Long id);
}
