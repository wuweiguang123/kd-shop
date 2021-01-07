package com.lvr.kdshop.controller;

import java.util.List;

import com.lvr.kdshop.domain.DictAreas;
import com.lvr.kdshop.service.IDictAreasService;
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
 * 区域字典Controller
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@RestController
@RequestMapping("/kdshop/areas")
public class DictAreasController extends BaseController
{
    @Autowired
    private IDictAreasService dictAreasService;

    /**
     * 查询区域字典列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:areas:list')")
    @GetMapping("/list")
    public TableDataInfo list(DictAreas dictAreas)
    {
        startPage();
        List<DictAreas> list = dictAreasService.selectDictAreasList(dictAreas);
        return getDataTable(list);
    }

    /**
     * 导出区域字典列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:areas:export')")
    @Log(title = "区域字典", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DictAreas dictAreas)
    {
        List<DictAreas> list = dictAreasService.selectDictAreasList(dictAreas);
        ExcelUtil<DictAreas> util = new ExcelUtil<DictAreas>(DictAreas.class);
        return util.exportExcel(list, "areas");
    }

    /**
     * 获取区域字典详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:areas:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dictAreasService.selectDictAreasById(id));
    }

    /**
     * 新增区域字典
     */
    @PreAuthorize("@ss.hasPermi('kdshop:areas:add')")
    @Log(title = "区域字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DictAreas dictAreas)
    {
        return toAjax(dictAreasService.insertDictAreas(dictAreas));
    }

    /**
     * 修改区域字典
     */
    @PreAuthorize("@ss.hasPermi('kdshop:areas:edit')")
    @Log(title = "区域字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DictAreas dictAreas)
    {
        return toAjax(dictAreasService.updateDictAreas(dictAreas));
    }

    /**
     * 删除区域字典
     */
    @PreAuthorize("@ss.hasPermi('kdshop:areas:remove')")
    @Log(title = "区域字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dictAreasService.deleteDictAreasByIds(ids));
    }
}
