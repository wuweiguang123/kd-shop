import request from '@/utils/request'

// 查询省份字典表列表
export function listProvinces(query) {
  return request({
    url: '/kdshop/provinces/list',
    method: 'get',
    params: query
  })
}

// 查询省份字典表详细
export function getProvinces(id) {
  return request({
    url: '/kdshop/provinces/' + id,
    method: 'get'
  })
}

// 新增省份字典表
export function addProvinces(data) {
  return request({
    url: '/kdshop/provinces',
    method: 'post',
    data: data
  })
}

// 修改省份字典表
export function updateProvinces(data) {
  return request({
    url: '/kdshop/provinces',
    method: 'put',
    data: data
  })
}

// 删除省份字典表
export function delProvinces(id) {
  return request({
    url: '/kdshop/provinces/' + id,
    method: 'delete'
  })
}

// 导出省份字典表
export function exportProvinces(query) {
  return request({
    url: '/kdshop/provinces/export',
    method: 'get',
    params: query
  })
}