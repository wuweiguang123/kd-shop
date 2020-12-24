module.exports = {
  root: true,

  env: {
    node: true
  },

  extends: [
    'plugin:vue/essential',
    '@vue/standard'
  ],

  parserOptions: {
    parser: 'babel-eslint'
  },

  rules: {
    "semi": 0, // 结尾是否强制添加分号， 0 => 忽略， 1 => 警告， 2 => 报错
    "space-before-function-paren": 0, // 方法名后去掉空格， 规则同上
    "no-debugger": 0, // 是否允许使用debugger调试， 规则同上
    "indent": 'off', //缩进风格(强制使用一致的缩进)
    "linebreak-style": 0, // 取消换行符\n或\r\n的验证()
    "no-tabs": 0,  //禁用tab
    'vue/singleline-html-element-content-newline': 'off',
    'vue/multiline-html-element-content-newline': 'off',
    'vue/max-attributes-per-line': 'off',
    'vue/attributes-order': 'off'
  },

  'extends': [
    'plugin:vue/recommended',
    '@vue/standard'
  ]
}
