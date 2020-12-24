import request from '@/utils/request'

// 查询区域字典列表
export function listAreas(query) {
  return request({
    url: '/kdshop/areas/list',
    method: 'get',
    params: query
  })
}

// 查询区域字典详细
export function getAreas(id) {
  return request({
    url: '/kdshop/areas/' + id,
    method: 'get'
  })
}

// 新增区域字典
export function addAreas(data) {
  return request({
    url: '/kdshop/areas',
    method: 'post',
    data: data
  })
}

// 修改区域字典
export function updateAreas(data) {
  return request({
    url: '/kdshop/areas',
    method: 'put',
    data: data
  })
}

// 删除区域字典
export function delAreas(id) {
  return request({
    url: '/kdshop/areas/' + id,
    method: 'delete'
  })
}

// 导出区域字典
export function exportAreas(query) {
  return request({
    url: '/kdshop/areas/export',
    method: 'get',
    params: query
  })
}