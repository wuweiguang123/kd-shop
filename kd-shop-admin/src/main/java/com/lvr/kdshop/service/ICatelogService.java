package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Catelog;

/**
 * 分类Service接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface ICatelogService 
{
    /**
     * 查询分类
     * 
     * @param id 分类ID
     * @return 分类
     */
    public Catelog selectCatelogById(Long id);

    /**
     * 查询分类列表
     * 
     * @param catelog 分类
     * @return 分类集合
     */
    public List<Catelog> selectCatelogList(Catelog catelog);

    /**
     * 新增分类
     * 
     * @param catelog 分类
     * @return 结果
     */
    public int insertCatelog(Catelog catelog);

    /**
     * 修改分类
     * 
     * @param catelog 分类
     * @return 结果
     */
    public int updateCatelog(Catelog catelog);

    /**
     * 批量删除分类
     * 
     * @param ids 需要删除的分类ID
     * @return 结果
     */
    public int deleteCatelogByIds(Long[] ids);

    /**
     * 删除分类信息
     * 
     * @param id 分类ID
     * @return 结果
     */
    public int deleteCatelogById(Long id);
}
