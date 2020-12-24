package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.DictProvinces;

/**
 * 省份字典表Service接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface IDictProvincesService 
{
    /**
     * 查询省份字典表
     * 
     * @param id 省份字典表ID
     * @return 省份字典表
     */
    public DictProvinces selectDictProvincesById(Long id);

    /**
     * 查询省份字典表列表
     * 
     * @param dictProvinces 省份字典表
     * @return 省份字典表集合
     */
    public List<DictProvinces> selectDictProvincesList(DictProvinces dictProvinces);

    /**
     * 新增省份字典表
     * 
     * @param dictProvinces 省份字典表
     * @return 结果
     */
    public int insertDictProvinces(DictProvinces dictProvinces);

    /**
     * 修改省份字典表
     * 
     * @param dictProvinces 省份字典表
     * @return 结果
     */
    public int updateDictProvinces(DictProvinces dictProvinces);

    /**
     * 批量删除省份字典表
     * 
     * @param ids 需要删除的省份字典表ID
     * @return 结果
     */
    public int deleteDictProvincesByIds(Long[] ids);

    /**
     * 删除省份字典表信息
     * 
     * @param id 省份字典表ID
     * @return 结果
     */
    public int deleteDictProvincesById(Long id);
}
