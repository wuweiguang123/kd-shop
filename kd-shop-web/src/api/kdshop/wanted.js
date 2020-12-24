import request from '@/utils/request'

// 查询收藏列表
export function listWanted(query) {
  return request({
    url: '/kdshop/wanted/list',
    method: 'get',
    params: query
  })
}

// 查询收藏详细
export function getWanted(id) {
  return request({
    url: '/kdshop/wanted/' + id,
    method: 'get'
  })
}

// 新增收藏
export function addWanted(data) {
  return request({
    url: '/kdshop/wanted',
    method: 'post',
    data: data
  })
}

// 修改收藏
export function updateWanted(data) {
  return request({
    url: '/kdshop/wanted',
    method: 'put',
    data: data
  })
}

// 删除收藏
export function delWanted(id) {
  return request({
    url: '/kdshop/wanted/' + id,
    method: 'delete'
  })
}

// 导出收藏
export function exportWanted(query) {
  return request({
    url: '/kdshop/wanted/export',
    method: 'get',
    params: query
  })
}