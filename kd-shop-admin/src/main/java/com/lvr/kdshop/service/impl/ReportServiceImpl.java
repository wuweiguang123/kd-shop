package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.ReportMapper;
import com.lvr.kdshop.domain.Report;
import com.lvr.kdshop.service.IReportService;

/**
 * 投诉Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class ReportServiceImpl implements IReportService 
{
    @Autowired
    private ReportMapper reportMapper;

    /**
     * 查询投诉
     * 
     * @param id 投诉ID
     * @return 投诉
     */
    @Override
    public Report selectReportById(Long id)
    {
        return reportMapper.selectReportById(id);
    }

    /**
     * 查询投诉列表
     * 
     * @param report 投诉
     * @return 投诉
     */
    @Override
    public List<Report> selectReportList(Report report)
    {
        return reportMapper.selectReportList(report);
    }

    /**
     * 新增投诉
     * 
     * @param report 投诉
     * @return 结果
     */
    @Override
    public int insertReport(Report report)
    {
        return reportMapper.insertReport(report);
    }

    /**
     * 修改投诉
     * 
     * @param report 投诉
     * @return 结果
     */
    @Override
    public int updateReport(Report report)
    {
        return reportMapper.updateReport(report);
    }

    /**
     * 批量删除投诉
     * 
     * @param ids 需要删除的投诉ID
     * @return 结果
     */
    @Override
    public int deleteReportByIds(Long[] ids)
    {
        return reportMapper.deleteReportByIds(ids);
    }

    /**
     * 删除投诉信息
     * 
     * @param id 投诉ID
     * @return 结果
     */
    @Override
    public int deleteReportById(Long id)
    {
        return reportMapper.deleteReportById(id);
    }
}
