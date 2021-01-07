package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.AddressMapper;
import com.lvr.kdshop.domain.Address;
import com.lvr.kdshop.service.IAddressService;

/**
 * 收件地址Service业务层处理
 * 
 * @author lvr1997
 * @date 2020-12-24
 */
@Service
public class AddressServiceImpl implements IAddressService 
{
    @Autowired
    private AddressMapper addressMapper;

    /**
     * 查询收件地址
     * 
     * @param id 收件地址ID
     * @return 收件地址
     */
    @Override
    public Address selectAddressById(Long id)
    {
        return addressMapper.selectAddressById(id);
    }

    /**
     * 查询收件地址列表
     * 
     * @param address 收件地址
     * @return 收件地址
     */
    @Override
    public List<Address> selectAddressList(Address address)
    {
        return addressMapper.selectAddressList(address);
    }

    /**
     * 新增收件地址
     * 
     * @param address 收件地址
     * @return 结果
     */
    @Override
    public int insertAddress(Address address)
    {
        return addressMapper.insertAddress(address);
    }

    /**
     * 修改收件地址
     * 
     * @param address 收件地址
     * @return 结果
     */
    @Override
    public int updateAddress(Address address)
    {
        return addressMapper.updateAddress(address);
    }

    /**
     * 批量删除收件地址
     * 
     * @param ids 需要删除的收件地址ID
     * @return 结果
     */
    @Override
    public int deleteAddressByIds(Long[] ids)
    {
        return addressMapper.deleteAddressByIds(ids);
    }

    /**
     * 删除收件地址信息
     * 
     * @param id 收件地址ID
     * @return 结果
     */
    @Override
    public int deleteAddressById(Long id)
    {
        return addressMapper.deleteAddressById(id);
    }
}
