package com.lvr.kdshop.controller;

import java.util.List;
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
import com.lvr.kdshop.domain.DictProvinces;
import com.lvr.kdshop.service.IDictProvincesService;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 省份字典表Controller
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@RestController
@RequestMapping("/kdshop/provinces")
public class DictProvincesController extends BaseController
{
    @Autowired
    private IDictProvincesService dictProvincesService;

    /**
     * 查询省份字典表列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:provinces:list')")
    @GetMapping("/list")
    public TableDataInfo list(DictProvinces dictProvinces)
    {
        startPage();
        List<DictProvinces> list = dictProvincesService.selectDictProvincesList(dictProvinces);
        return getDataTable(list);
    }

    /**
     * 导出省份字典表列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:provinces:export')")
    @Log(title = "省份字典表", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DictProvinces dictProvinces)
    {
        List<DictProvinces> list = dictProvincesService.selectDictProvincesList(dictProvinces);
        ExcelUtil<DictProvinces> util = new ExcelUtil<DictProvinces>(DictProvinces.class);
        return util.exportExcel(list, "provinces");
    }

    /**
     * 获取省份字典表详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:provinces:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dictProvincesService.selectDictProvincesById(id));
    }

    /**
     * 新增省份字典表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:provinces:add')")
    @Log(title = "省份字典表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DictProvinces dictProvinces)
    {
        return toAjax(dictProvincesService.insertDictProvinces(dictProvinces));
    }

    /**
     * 修改省份字典表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:provinces:edit')")
    @Log(title = "省份字典表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DictProvinces dictProvinces)
    {
        return toAjax(dictProvincesService.updateDictProvinces(dictProvinces));
    }

    /**
     * 删除省份字典表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:provinces:remove')")
    @Log(title = "省份字典表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dictProvincesService.deleteDictProvincesByIds(ids));
    }
}
