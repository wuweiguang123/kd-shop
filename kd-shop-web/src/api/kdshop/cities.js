import request from '@/utils/request'

// 查询城市字典列表
export function listCities(query) {
  return request({
    url: '/kdshop/cities/list',
    method: 'get',
    params: query
  })
}

// 查询城市字典详细
export function getCities(id) {
  return request({
    url: '/kdshop/cities/' + id,
    method: 'get'
  })
}

// 新增城市字典
export function addCities(data) {
  return request({
    url: '/kdshop/cities',
    method: 'post',
    data: data
  })
}

// 修改城市字典
export function updateCities(data) {
  return request({
    url: '/kdshop/cities',
    method: 'put',
    data: data
  })
}

// 删除城市字典
export function delCities(id) {
  return request({
    url: '/kdshop/cities/' + id,
    method: 'delete'
  })
}

// 导出城市字典
export function exportCities(query) {
  return request({
    url: '/kdshop/cities/export',
    method: 'get',
    params: query
  })
}