package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.DictCitiesMapper;
import com.lvr.kdshop.domain.DictCities;
import com.lvr.kdshop.service.IDictCitiesService;

/**
 * 城市字典Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class DictCitiesServiceImpl implements IDictCitiesService 
{
    @Autowired
    private DictCitiesMapper dictCitiesMapper;

    /**
     * 查询城市字典
     * 
     * @param id 城市字典ID
     * @return 城市字典
     */
    @Override
    public DictCities selectDictCitiesById(Long id)
    {
        return dictCitiesMapper.selectDictCitiesById(id);
    }

    /**
     * 查询城市字典列表
     * 
     * @param dictCities 城市字典
     * @return 城市字典
     */
    @Override
    public List<DictCities> selectDictCitiesList(DictCities dictCities)
    {
        return dictCitiesMapper.selectDictCitiesList(dictCities);
    }

    /**
     * 新增城市字典
     * 
     * @param dictCities 城市字典
     * @return 结果
     */
    @Override
    public int insertDictCities(DictCities dictCities)
    {
        return dictCitiesMapper.insertDictCities(dictCities);
    }

    /**
     * 修改城市字典
     * 
     * @param dictCities 城市字典
     * @return 结果
     */
    @Override
    public int updateDictCities(DictCities dictCities)
    {
        return dictCitiesMapper.updateDictCities(dictCities);
    }

    /**
     * 批量删除城市字典
     * 
     * @param ids 需要删除的城市字典ID
     * @return 结果
     */
    @Override
    public int deleteDictCitiesByIds(Long[] ids)
    {
        return dictCitiesMapper.deleteDictCitiesByIds(ids);
    }

    /**
     * 删除城市字典信息
     * 
     * @param id 城市字典ID
     * @return 结果
     */
    @Override
    public int deleteDictCitiesById(Long id)
    {
        return dictCitiesMapper.deleteDictCitiesById(id);
    }
}
