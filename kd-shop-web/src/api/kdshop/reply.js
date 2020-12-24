import request from '@/utils/request'

// 查询评论回复列表
export function listReply(query) {
  return request({
    url: '/kdshop/reply/list',
    method: 'get',
    params: query
  })
}

// 查询评论回复详细
export function getReply(id) {
  return request({
    url: '/kdshop/reply/' + id,
    method: 'get'
  })
}

// 新增评论回复
export function addReply(data) {
  return request({
    url: '/kdshop/reply',
    method: 'post',
    data: data
  })
}

// 修改评论回复
export function updateReply(data) {
  return request({
    url: '/kdshop/reply',
    method: 'put',
    data: data
  })
}

// 删除评论回复
export function delReply(id) {
  return request({
    url: '/kdshop/reply/' + id,
    method: 'delete'
  })
}

// 导出评论回复
export function exportReply(query) {
  return request({
    url: '/kdshop/reply/export',
    method: 'get',
    params: query
  })
}