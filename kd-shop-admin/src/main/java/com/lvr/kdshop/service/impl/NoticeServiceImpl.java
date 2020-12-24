package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.NoticeMapper;
import com.lvr.kdshop.domain.Notice;
import com.lvr.kdshop.service.INoticeService;

/**
 * 系统通知Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class NoticeServiceImpl implements INoticeService 
{
    @Autowired
    private NoticeMapper noticeMapper;

    /**
     * 查询系统通知
     * 
     * @param id 系统通知ID
     * @return 系统通知
     */
    @Override
    public Notice selectNoticeById(Long id)
    {
        return noticeMapper.selectNoticeById(id);
    }

    /**
     * 查询系统通知列表
     * 
     * @param notice 系统通知
     * @return 系统通知
     */
    @Override
    public List<Notice> selectNoticeList(Notice notice)
    {
        return noticeMapper.selectNoticeList(notice);
    }

    /**
     * 新增系统通知
     * 
     * @param notice 系统通知
     * @return 结果
     */
    @Override
    public int insertNotice(Notice notice)
    {
        return noticeMapper.insertNotice(notice);
    }

    /**
     * 修改系统通知
     * 
     * @param notice 系统通知
     * @return 结果
     */
    @Override
    public int updateNotice(Notice notice)
    {
        return noticeMapper.updateNotice(notice);
    }

    /**
     * 批量删除系统通知
     * 
     * @param ids 需要删除的系统通知ID
     * @return 结果
     */
    @Override
    public int deleteNoticeByIds(Long[] ids)
    {
        return noticeMapper.deleteNoticeByIds(ids);
    }

    /**
     * 删除系统通知信息
     * 
     * @param id 系统通知ID
     * @return 结果
     */
    @Override
    public int deleteNoticeById(Long id)
    {
        return noticeMapper.deleteNoticeById(id);
    }
}
