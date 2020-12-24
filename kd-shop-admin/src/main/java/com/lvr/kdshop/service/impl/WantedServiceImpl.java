package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.WantedMapper;
import com.lvr.kdshop.domain.Wanted;
import com.lvr.kdshop.service.IWantedService;

/**
 * 收藏Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class WantedServiceImpl implements IWantedService 
{
    @Autowired
    private WantedMapper wantedMapper;

    /**
     * 查询收藏
     * 
     * @param id 收藏ID
     * @return 收藏
     */
    @Override
    public Wanted selectWantedById(Long id)
    {
        return wantedMapper.selectWantedById(id);
    }

    /**
     * 查询收藏列表
     * 
     * @param wanted 收藏
     * @return 收藏
     */
    @Override
    public List<Wanted> selectWantedList(Wanted wanted)
    {
        return wantedMapper.selectWantedList(wanted);
    }

    /**
     * 新增收藏
     * 
     * @param wanted 收藏
     * @return 结果
     */
    @Override
    public int insertWanted(Wanted wanted)
    {
        return wantedMapper.insertWanted(wanted);
    }

    /**
     * 修改收藏
     * 
     * @param wanted 收藏
     * @return 结果
     */
    @Override
    public int updateWanted(Wanted wanted)
    {
        return wantedMapper.updateWanted(wanted);
    }

    /**
     * 批量删除收藏
     * 
     * @param ids 需要删除的收藏ID
     * @return 结果
     */
    @Override
    public int deleteWantedByIds(Long[] ids)
    {
        return wantedMapper.deleteWantedByIds(ids);
    }

    /**
     * 删除收藏信息
     * 
     * @param id 收藏ID
     * @return 结果
     */
    @Override
    public int deleteWantedById(Long id)
    {
        return wantedMapper.deleteWantedById(id);
    }
}
