import Vue from 'vue'
import {
  Button, Switch,
  Form, FormItem, Input, Select, Option,
  Message, MessageBox, Notification,
  Container, Header, Aside, Main, Footer,
  Menu, MenuItem, Submenu,
  Breadcrumb, BreadcrumbItem,
  Card,
  Table, TableColumn, Pagination,
  Tooltip, Link, Backtop,
  Carousel, CarouselItem,
  Row, Col
} from 'element-ui'

Vue.use(Button)
Vue.use(Switch)
Vue.use(Form)
Vue.use(FormItem)
Vue.use(Input)
Vue.use(Select)
Vue.use(Option)
Vue.use(Container)
Vue.use(Header)
Vue.use(Aside)
Vue.use(Main)
Vue.use(Footer)
Vue.use(Menu)
Vue.use(MenuItem)
Vue.use(Submenu)
Vue.use(Breadcrumb)
Vue.use(BreadcrumbItem)
Vue.use(Card)
Vue.use(Table)
Vue.use(TableColumn)
Vue.use(Pagination)
Vue.use(Tooltip)
Vue.use(Link)
Vue.use(Backtop)
Vue.use(Carousel)
Vue.use(CarouselItem)
Vue.use(Row)
Vue.use(Col)
Vue.prototype.$message = Message
Vue.prototype.$confirm = MessageBox.confirm
Vue.prototype.$notify = Notification
