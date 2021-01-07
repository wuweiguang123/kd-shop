import request from '@/utils/request'

// 查询收件地址列表
export function listAddress(query) {
  return request({
    url: '/kdshop/address/list',
    method: 'get',
    params: query
  })
}

// 查询收件地址详细
export function getAddress(id) {
  return request({
    url: '/kdshop/address/' + id,
    method: 'get'
  })
}

// 新增收件地址
export function addAddress(data) {
  return request({
    url: '/kdshop/address',
    method: 'post',
    data: data
  })
}

// 修改收件地址
export function updateAddress(data) {
  return request({
    url: '/kdshop/address',
    method: 'put',
    data: data
  })
}

// 删除收件地址
export function delAddress(id) {
  return request({
    url: '/kdshop/address/' + id,
    method: 'delete'
  })
}

// 导出收件地址
export function exportAddress(query) {
  return request({
    url: '/kdshop/address/export',
    method: 'get',
    params: query
  })
}