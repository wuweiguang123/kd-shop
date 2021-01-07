package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.DictProvincesMapper;
import com.lvr.kdshop.domain.DictProvinces;
import com.lvr.kdshop.service.IDictProvincesService;

/**
 * 省份字典表Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class DictProvincesServiceImpl implements IDictProvincesService 
{
    @Autowired
    private DictProvincesMapper dictProvincesMapper;

    /**
     * 查询省份字典表
     * 
     * @param id 省份字典表ID
     * @return 省份字典表
     */
    @Override
    public DictProvinces selectDictProvincesById(Long id)
    {
        return dictProvincesMapper.selectDictProvincesById(id);
    }

    /**
     * 查询省份字典表列表
     * 
     * @param dictProvinces 省份字典表
     * @return 省份字典表
     */
    @Override
    public List<DictProvinces> selectDictProvincesList(DictProvinces dictProvinces)
    {
        return dictProvincesMapper.selectDictProvincesList(dictProvinces);
    }

    /**
     * 新增省份字典表
     * 
     * @param dictProvinces 省份字典表
     * @return 结果
     */
    @Override
    public int insertDictProvinces(DictProvinces dictProvinces)
    {
        return dictProvincesMapper.insertDictProvinces(dictProvinces);
    }

    /**
     * 修改省份字典表
     * 
     * @param dictProvinces 省份字典表
     * @return 结果
     */
    @Override
    public int updateDictProvinces(DictProvinces dictProvinces)
    {
        return dictProvincesMapper.updateDictProvinces(dictProvinces);
    }

    /**
     * 批量删除省份字典表
     * 
     * @param ids 需要删除的省份字典表ID
     * @return 结果
     */
    @Override
    public int deleteDictProvincesByIds(Long[] ids)
    {
        return dictProvincesMapper.deleteDictProvincesByIds(ids);
    }

    /**
     * 删除省份字典表信息
     * 
     * @param id 省份字典表ID
     * @return 结果
     */
    @Override
    public int deleteDictProvincesById(Long id)
    {
        return dictProvincesMapper.deleteDictProvincesById(id);
    }
}
