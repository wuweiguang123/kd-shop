<template>
  <el-container>
    <!-- header start -->
    <el-header>
      <div class="logo">
        <img src="src/assets/logo/kdmall-logo.png">
      </div>
      <div class="nav-right">
        <el-link>注册</el-link>
        <el-link class="login-btn">登录</el-link>
      </div>
    </el-header>
    <!-- header end -->
    <!-- main start -->
    <el-main>
      <div class="main-search">
        <el-input placeholder="请输入内容" v-model="input3" class="input-with-select">
          <el-select v-model="select" slot="prepend" placeholder="请选择">
            <el-option label="书籍" value="1" />
            <el-option label="数码" value="2" />
            <el-option label="日用品" value="3" />
          </el-select>
          <el-button slot="append" icon="el-icon-search" />
        </el-input>
      </div>
      <div class="main-header">
        <div class="left">
          <ul>
            <li v-for="catelog in catelogs" :key="catelog.id">
              {{catelog.name}}
            </li>
          </ul>
        </div>
        <div class="banner">
          <el-carousel height="250px">
            <el-carousel-item v-for="item in banners" :key="item.id">
              <img :src="item.imgUrl">
            </el-carousel-item>
          </el-carousel>
        </div>
      </div>
      <!-- goods start -->
      <div class="main-header main-body">
        <el-card :body-style="{ padding: '0px' }" v-for="good in goods" :key="good.id">
          <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image">
          <div style="padding: 14px;">
            <span>{{ good.name }}</span>
            <div class="bottom clearfix">
              <time class="time">{{ good.polishTime }}</time>
              <el-button type="text" class="button">操作按钮</el-button>
            </div>
          </div>
        </el-card>
      </div>
      <!-- goods end -->
    </el-main>
    <!-- main end -->
    <!-- footer -->
    <el-footer>
      <div class="footer-bottom-wrap">
        <div class="footer-bottom">
          <p class="tips">本站所有信息均为用户自由发布，本站不对信息的真实性负任何责任，交易时请注意识别信息的真假如有网站内容侵害了您的权益请联系我们删除</p>
          <p class="right">
            <span>Copyright © 2017-2018, kd-shop, All Rights Reserved</span>
          </p>
        </div>
      </div>
    </el-footer>
    <el-backtop target=".logo" />
  </el-container>
</template>

<script>
    import { indexData } from '@/utils/api.js' // 导入api接口

    export default {
        name: 'Index',
        data() {
            return {
                catelogs: [],
                banners: [],
                goods: [],
                input3: '',
                select: ''
            }
        },
        // 组件创建时执行
        created() {
            this.getIndexData()
        },
        methods: {
            getIndexData() {
                indexData().then(res => {
                    // 处理响应数据
                    console.log(res)
                    this.catelogs = res.data.catelogs
                    this.banners = res.data.carousels
                    this.goods = res.data.goods
                }).catch(error => {
                    console.log(error)
                })
            }
        }
    }
</script>

<style lang="less" scoped>
  .el-header, .el-footer {
    background-color: #FFF;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  .el-header .logo {
    float: left;
    margin-left: 100px;
    height: 60px;
  }
  .el-header .logo img {
    margin-top: 4px;
  }
  .el-header .nav-right {
    float: right;
    margin-right: 100px;
    .login-btn {
      margin-left: 20px;
    }
  }
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
  }
  .main-search {
    width: 550px;
    height: 60px;
    margin: 0 auto;

    .el-select {
      width: 120px;
    }
    .input-with-select .el-input-group__prepend {
      background-color: #fff;
    }
  }
  .main-header{
    width: 1200px;
    margin: 0 auto;
    overflow: hidden;
  }
  .left{
    float: left;
    margin-left: 60px;
    ul li {
      width: 200px;
      height: 40px;
      line-height: 40px;
      background-color: #ffffff;
    }
  }
  .banner {
    float: right;
    width: 500px;
    margin-right: 342px;
    // border: 1px solid red;
    img {
      width: 500px;
    }
  }
  body > .el-container {
    margin-bottom: 40px;
  }

  .main-body {
    margin-top: 25px;
    .el-card {
      width: 270px;
      float: left;
      margin-right: 28px;
      margin-top: 15px;
    }
  }

  .footer-bottom-wrap {
    background-color: #fff;
    height: 180px;
    min-width: 1100px;
    .footer-bottom {
      width: 1100px;
      margin: 0 auto;
      padding-top: 20px;
      p {
        margin-top: 15px;
        font-size: 13px;
        color: #A9AAAA;
      }
    }
  }

  .time {
    font-size: 13px;
    color: #999;
  }

  .bottom {
    margin-top: 13px;
    line-height: 12px;
  }

  .button {
    padding: 0;
    float: right;
  }

  .image {
    width: 100%;
    display: block;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }

  .clearfix:after {
    clear: both
  }
</style>
