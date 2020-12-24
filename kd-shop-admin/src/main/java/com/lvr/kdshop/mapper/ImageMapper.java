package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Image;

/**
 * 商品图片Mapper接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface ImageMapper 
{
    /**
     * 查询商品图片
     * 
     * @param id 商品图片ID
     * @return 商品图片
     */
    public Image selectImageById(Long id);

    /**
     * 查询商品图片列表
     * 
     * @param image 商品图片
     * @return 商品图片集合
     */
    public List<Image> selectImageList(Image image);

    /**
     * 新增商品图片
     * 
     * @param image 商品图片
     * @return 结果
     */
    public int insertImage(Image image);

    /**
     * 修改商品图片
     * 
     * @param image 商品图片
     * @return 结果
     */
    public int updateImage(Image image);

    /**
     * 删除商品图片
     * 
     * @param id 商品图片ID
     * @return 结果
     */
    public int deleteImageById(Long id);

    /**
     * 批量删除商品图片
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteImageByIds(Long[] ids);
}
