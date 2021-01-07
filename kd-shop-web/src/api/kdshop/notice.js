import request from '@/utils/request'

// 查询系统通知列表
export function listNotice(query) {
  return request({
    url: '/kdshop/notice/list',
    method: 'get',
    params: query
  })
}

// 查询系统通知详细
export function getNotice(id) {
  return request({
    url: '/kdshop/notice/' + id,
    method: 'get'
  })
}

// 新增系统通知
export function addNotice(data) {
  return request({
    url: '/kdshop/notice',
    method: 'post',
    data: data
  })
}

// 修改系统通知
export function updateNotice(data) {
  return request({
    url: '/kdshop/notice',
    method: 'put',
    data: data
  })
}

// 删除系统通知
export function delNotice(id) {
  return request({
    url: '/kdshop/notice/' + id,
    method: 'delete'
  })
}

// 导出系统通知
export function exportNotice(query) {
  return request({
    url: '/kdshop/notice/export',
    method: 'get',
    params: query
  })
}