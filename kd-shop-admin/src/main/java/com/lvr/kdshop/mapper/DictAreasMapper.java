package com.lvr.kdshop.mapper;

import com.lvr.kdshop.domain.DictAreas;

import java.util.List;

/**
 * 区域字典Mapper接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface DictAreasMapper 
{
    /**
     * 查询区域字典
     * 
     * @param id 区域字典ID
     * @return 区域字典
     */
    public DictAreas selectDictAreasById(Long id);

    /**
     * 查询区域字典列表
     * 
     * @param dictAreas 区域字典
     * @return 区域字典集合
     */
    public List<DictAreas> selectDictAreasList(DictAreas dictAreas);

    /**
     * 新增区域字典
     * 
     * @param dictAreas 区域字典
     * @return 结果
     */
    public int insertDictAreas(DictAreas dictAreas);

    /**
     * 修改区域字典
     * 
     * @param dictAreas 区域字典
     * @return 结果
     */
    public int updateDictAreas(DictAreas dictAreas);

    /**
     * 删除区域字典
     * 
     * @param id 区域字典ID
     * @return 结果
     */
    public int deleteDictAreasById(Long id);

    /**
     * 批量删除区域字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDictAreasByIds(Long[] ids);
}
