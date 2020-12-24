import request from '@/utils/request'

// 查询投诉列表
export function listReport(query) {
  return request({
    url: '/kdshop/report/list',
    method: 'get',
    params: query
  })
}

// 查询投诉详细
export function getReport(id) {
  return request({
    url: '/kdshop/report/' + id,
    method: 'get'
  })
}

// 新增投诉
export function addReport(data) {
  return request({
    url: '/kdshop/report',
    method: 'post',
    data: data
  })
}

// 修改投诉
export function updateReport(data) {
  return request({
    url: '/kdshop/report',
    method: 'put',
    data: data
  })
}

// 删除投诉
export function delReport(id) {
  return request({
    url: '/kdshop/report/' + id,
    method: 'delete'
  })
}

// 导出投诉
export function exportReport(query) {
  return request({
    url: '/kdshop/report/export',
    method: 'get',
    params: query
  })
}