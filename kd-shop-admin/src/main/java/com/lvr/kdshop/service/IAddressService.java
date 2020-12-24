package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Address;

/**
 * 收件地址Service接口
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
public interface IAddressService 
{
    /**
     * 查询收件地址
     * 
     * @param id 收件地址ID
     * @return 收件地址
     */
    public Address selectAddressById(Long id);

    /**
     * 查询收件地址列表
     * 
     * @param address 收件地址
     * @return 收件地址集合
     */
    public List<Address> selectAddressList(Address address);

    /**
     * 新增收件地址
     * 
     * @param address 收件地址
     * @return 结果
     */
    public int insertAddress(Address address);

    /**
     * 修改收件地址
     * 
     * @param address 收件地址
     * @return 结果
     */
    public int updateAddress(Address address);

    /**
     * 批量删除收件地址
     * 
     * @param ids 需要删除的收件地址ID
     * @return 结果
     */
    public int deleteAddressByIds(Long[] ids);

    /**
     * 删除收件地址信息
     * 
     * @param id 收件地址ID
     * @return 结果
     */
    public int deleteAddressById(Long id);
}
