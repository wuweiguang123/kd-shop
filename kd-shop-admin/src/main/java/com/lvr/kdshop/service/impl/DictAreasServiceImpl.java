package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.DictAreasMapper;
import com.lvr.kdshop.domain.DictAreas;
import com.lvr.kdshop.service.IDictAreasService;

/**
 * 区域字典Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class DictAreasServiceImpl implements IDictAreasService 
{
    @Autowired
    private DictAreasMapper dictAreasMapper;

    /**
     * 查询区域字典
     * 
     * @param id 区域字典ID
     * @return 区域字典
     */
    @Override
    public DictAreas selectDictAreasById(Long id)
    {
        return dictAreasMapper.selectDictAreasById(id);
    }

    /**
     * 查询区域字典列表
     * 
     * @param dictAreas 区域字典
     * @return 区域字典
     */
    @Override
    public List<DictAreas> selectDictAreasList(DictAreas dictAreas)
    {
        return dictAreasMapper.selectDictAreasList(dictAreas);
    }

    /**
     * 新增区域字典
     * 
     * @param dictAreas 区域字典
     * @return 结果
     */
    @Override
    public int insertDictAreas(DictAreas dictAreas)
    {
        return dictAreasMapper.insertDictAreas(dictAreas);
    }

    /**
     * 修改区域字典
     * 
     * @param dictAreas 区域字典
     * @return 结果
     */
    @Override
    public int updateDictAreas(DictAreas dictAreas)
    {
        return dictAreasMapper.updateDictAreas(dictAreas);
    }

    /**
     * 批量删除区域字典
     * 
     * @param ids 需要删除的区域字典ID
     * @return 结果
     */
    @Override
    public int deleteDictAreasByIds(Long[] ids)
    {
        return dictAreasMapper.deleteDictAreasByIds(ids);
    }

    /**
     * 删除区域字典信息
     * 
     * @param id 区域字典ID
     * @return 结果
     */
    @Override
    public int deleteDictAreasById(Long id)
    {
        return dictAreasMapper.deleteDictAreasById(id);
    }
}
