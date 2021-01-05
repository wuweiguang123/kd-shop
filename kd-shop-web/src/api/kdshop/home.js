import request from '@/utils/request'

//查询首页数据
export function indexData(query) {
  const good =  {
    name: query.name,
    catelogId: query.catelogId
  }
  return request({
    url: '/getIndexData',
    method: 'get',
    params: good
  })
}
