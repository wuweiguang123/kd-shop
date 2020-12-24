package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Wanted;

/**
 * 收藏Mapper接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface WantedMapper 
{
    /**
     * 查询收藏
     * 
     * @param id 收藏ID
     * @return 收藏
     */
    public Wanted selectWantedById(Long id);

    /**
     * 查询收藏列表
     * 
     * @param wanted 收藏
     * @return 收藏集合
     */
    public List<Wanted> selectWantedList(Wanted wanted);

    /**
     * 新增收藏
     * 
     * @param wanted 收藏
     * @return 结果
     */
    public int insertWanted(Wanted wanted);

    /**
     * 修改收藏
     * 
     * @param wanted 收藏
     * @return 结果
     */
    public int updateWanted(Wanted wanted);

    /**
     * 删除收藏
     * 
     * @param id 收藏ID
     * @return 结果
     */
    public int deleteWantedById(Long id);

    /**
     * 批量删除收藏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWantedByIds(Long[] ids);
}
