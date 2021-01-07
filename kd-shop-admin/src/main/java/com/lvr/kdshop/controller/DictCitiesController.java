package com.lvr.kdshop.controller;

import java.util.List;

import com.lvr.kdshop.domain.DictCities;
import com.lvr.kdshop.service.IDictCitiesService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lvr.common.annotation.Log;
import com.lvr.common.core.controller.BaseController;
import com.lvr.common.core.domain.AjaxResult;
import com.lvr.common.enums.BusinessType;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 城市字典Controller
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@RestController
@RequestMapping("/kdshop/cities")
public class DictCitiesController extends BaseController
{
    @Autowired
    private IDictCitiesService dictCitiesService;

    /**
     * 查询城市字典列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:cities:list')")
    @GetMapping("/list")
    public TableDataInfo list(DictCities dictCities)
    {
        startPage();
        List<DictCities> list = dictCitiesService.selectDictCitiesList(dictCities);
        return getDataTable(list);
    }

    /**
     * 导出城市字典列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:cities:export')")
    @Log(title = "城市字典", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DictCities dictCities)
    {
        List<DictCities> list = dictCitiesService.selectDictCitiesList(dictCities);
        ExcelUtil<DictCities> util = new ExcelUtil<DictCities>(DictCities.class);
        return util.exportExcel(list, "cities");
    }

    /**
     * 获取城市字典详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:cities:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dictCitiesService.selectDictCitiesById(id));
    }

    /**
     * 新增城市字典
     */
    @PreAuthorize("@ss.hasPermi('kdshop:cities:add')")
    @Log(title = "城市字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DictCities dictCities)
    {
        return toAjax(dictCitiesService.insertDictCities(dictCities));
    }

    /**
     * 修改城市字典
     */
    @PreAuthorize("@ss.hasPermi('kdshop:cities:edit')")
    @Log(title = "城市字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DictCities dictCities)
    {
        return toAjax(dictCitiesService.updateDictCities(dictCities));
    }

    /**
     * 删除城市字典
     */
    @PreAuthorize("@ss.hasPermi('kdshop:cities:remove')")
    @Log(title = "城市字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dictCitiesService.deleteDictCitiesByIds(ids));
    }
}
