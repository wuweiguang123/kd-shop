package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Notice;

/**
 * 系统通知Service接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface INoticeService 
{
    /**
     * 查询系统通知
     * 
     * @param id 系统通知ID
     * @return 系统通知
     */
    public Notice selectNoticeById(Long id);

    /**
     * 查询系统通知列表
     * 
     * @param notice 系统通知
     * @return 系统通知集合
     */
    public List<Notice> selectNoticeList(Notice notice);

    /**
     * 新增系统通知
     * 
     * @param notice 系统通知
     * @return 结果
     */
    public int insertNotice(Notice notice);

    /**
     * 修改系统通知
     * 
     * @param notice 系统通知
     * @return 结果
     */
    public int updateNotice(Notice notice);

    /**
     * 批量删除系统通知
     * 
     * @param ids 需要删除的系统通知ID
     * @return 结果
     */
    public int deleteNoticeByIds(Long[] ids);

    /**
     * 删除系统通知信息
     * 
     * @param id 系统通知ID
     * @return 结果
     */
    public int deleteNoticeById(Long id);
}
