package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.CatelogMapper;
import com.lvr.kdshop.domain.Catelog;
import com.lvr.kdshop.service.ICatelogService;

/**
 * 分类Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class CatelogServiceImpl implements ICatelogService 
{
    @Autowired
    private CatelogMapper catelogMapper;

    /**
     * 查询分类
     * 
     * @param id 分类ID
     * @return 分类
     */
    @Override
    public Catelog selectCatelogById(Long id)
    {
        return catelogMapper.selectCatelogById(id);
    }

    /**
     * 查询分类列表
     * 
     * @param catelog 分类
     * @return 分类
     */
    @Override
    public List<Catelog> selectCatelogList(Catelog catelog)
    {
        return catelogMapper.selectCatelogList(catelog);
    }

    /**
     * 新增分类
     * 
     * @param catelog 分类
     * @return 结果
     */
    @Override
    public int insertCatelog(Catelog catelog)
    {
        return catelogMapper.insertCatelog(catelog);
    }

    /**
     * 修改分类
     * 
     * @param catelog 分类
     * @return 结果
     */
    @Override
    public int updateCatelog(Catelog catelog)
    {
        return catelogMapper.updateCatelog(catelog);
    }

    /**
     * 批量删除分类
     * 
     * @param ids 需要删除的分类ID
     * @return 结果
     */
    @Override
    public int deleteCatelogByIds(Long[] ids)
    {
        return catelogMapper.deleteCatelogByIds(ids);
    }

    /**
     * 删除分类信息
     * 
     * @param id 分类ID
     * @return 结果
     */
    @Override
    public int deleteCatelogById(Long id)
    {
        return catelogMapper.deleteCatelogById(id);
    }
}
