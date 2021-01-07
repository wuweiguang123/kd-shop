import request from '@/utils/request'

// 查询分类列表
export function listCatelog(query) {
  return request({
    url: '/kdshop/catelog/list',
    method: 'get',
    params: query
  })
}

// 查询分类详细
export function getCatelog(id) {
  return request({
    url: '/kdshop/catelog/' + id,
    method: 'get'
  })
}

// 新增分类
export function addCatelog(data) {
  return request({
    url: '/kdshop/catelog',
    method: 'post',
    data: data
  })
}

// 修改分类
export function updateCatelog(data) {
  return request({
    url: '/kdshop/catelog',
    method: 'put',
    data: data
  })
}

// 删除分类
export function delCatelog(id) {
  return request({
    url: '/kdshop/catelog/' + id,
    method: 'delete'
  })
}

// 导出分类
export function exportCatelog(query) {
  return request({
    url: '/kdshop/catelog/export',
    method: 'get',
    params: query
  })
}