package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.DictCities;

/**
 * 城市字典Mapper接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface DictCitiesMapper 
{
    /**
     * 查询城市字典
     * 
     * @param id 城市字典ID
     * @return 城市字典
     */
    public DictCities selectDictCitiesById(Long id);

    /**
     * 查询城市字典列表
     * 
     * @param dictCities 城市字典
     * @return 城市字典集合
     */
    public List<DictCities> selectDictCitiesList(DictCities dictCities);

    /**
     * 新增城市字典
     * 
     * @param dictCities 城市字典
     * @return 结果
     */
    public int insertDictCities(DictCities dictCities);

    /**
     * 修改城市字典
     * 
     * @param dictCities 城市字典
     * @return 结果
     */
    public int updateDictCities(DictCities dictCities);

    /**
     * 删除城市字典
     * 
     * @param id 城市字典ID
     * @return 结果
     */
    public int deleteDictCitiesById(Long id);

    /**
     * 批量删除城市字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDictCitiesByIds(Long[] ids);
}
