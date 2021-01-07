package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.ImageMapper;
import com.lvr.kdshop.domain.Image;
import com.lvr.kdshop.service.IImageService;

/**
 * 商品图片Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class ImageServiceImpl implements IImageService 
{
    @Autowired
    private ImageMapper imageMapper;

    /**
     * 查询商品图片
     * 
     * @param id 商品图片ID
     * @return 商品图片
     */
    @Override
    public Image selectImageById(Long id)
    {
        return imageMapper.selectImageById(id);
    }

    /**
     * 查询商品图片列表
     * 
     * @param image 商品图片
     * @return 商品图片
     */
    @Override
    public List<Image> selectImageList(Image image)
    {
        return imageMapper.selectImageList(image);
    }

    /**
     * 新增商品图片
     * 
     * @param image 商品图片
     * @return 结果
     */
    @Override
    public int insertImage(Image image)
    {
        return imageMapper.insertImage(image);
    }

    /**
     * 修改商品图片
     * 
     * @param image 商品图片
     * @return 结果
     */
    @Override
    public int updateImage(Image image)
    {
        return imageMapper.updateImage(image);
    }

    /**
     * 批量删除商品图片
     * 
     * @param ids 需要删除的商品图片ID
     * @return 结果
     */
    @Override
    public int deleteImageByIds(Long[] ids)
    {
        return imageMapper.deleteImageByIds(ids);
    }

    /**
     * 删除商品图片信息
     * 
     * @param id 商品图片ID
     * @return 结果
     */
    @Override
    public int deleteImageById(Long id)
    {
        return imageMapper.deleteImageById(id);
    }
}
