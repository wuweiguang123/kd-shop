<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="catelogId">
        <el-select v-model="queryParams.catelogId" placeholder="请选择${comment}" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="${comment}" prop="userId">
        <el-select v-model="queryParams.userId" placeholder="请选择${comment}" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="${comment}" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="price">
        <el-input
          v-model="queryParams.price"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="realPrice">
        <el-input
          v-model="queryParams.realPrice"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="startTime">
        <el-date-picker clearable size="small" style="width: 200px"
          v-model="queryParams.startTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="polishTime">
        <el-date-picker clearable size="small" style="width: 200px"
          v-model="queryParams.polishTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="endTime">
        <el-date-picker clearable size="small" style="width: 200px"
          v-model="queryParams.endTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="commetNum">
        <el-input
          v-model="queryParams.commetNum"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="phoneNumber">
        <el-input
          v-model="queryParams.phoneNumber"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="qqNumber">
        <el-input
          v-model="queryParams.qqNumber"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="wxNumber">
        <el-input
          v-model="queryParams.wxNumber"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="goodCity">
        <el-input
          v-model="queryParams.goodCity"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="goodBuyMethod">
        <el-input
          v-model="queryParams.goodBuyMethod"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="goodAddress">
        <el-input
          v-model="queryParams.goodAddress"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="viewcount">
        <el-input
          v-model="queryParams.viewcount"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="describle">
        <el-input
          v-model="queryParams.describle"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="status">
        <el-select v-model="queryParams.status" placeholder="请选择${comment}" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['kdshop:goods:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['kdshop:goods:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['kdshop:goods:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['kdshop:goods:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="goodsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="${comment}" align="center" prop="catelogId" />
      <el-table-column label="${comment}" align="center" prop="userId" />
      <el-table-column label="${comment}" align="center" prop="name" />
      <el-table-column label="${comment}" align="center" prop="price" />
      <el-table-column label="${comment}" align="center" prop="realPrice" />
      <el-table-column label="${comment}" align="center" prop="startTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.startTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="polishTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.polishTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="endTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.endTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="commetNum" />
      <el-table-column label="${comment}" align="center" prop="phoneNumber" />
      <el-table-column label="${comment}" align="center" prop="qqNumber" />
      <el-table-column label="${comment}" align="center" prop="wxNumber" />
      <el-table-column label="${comment}" align="center" prop="goodCity" />
      <el-table-column label="${comment}" align="center" prop="goodBuyMethod" />
      <el-table-column label="${comment}" align="center" prop="goodAddress" />
      <el-table-column label="${comment}" align="center" prop="viewcount" />
      <el-table-column label="${comment}" align="center" prop="describle" />
      <el-table-column label="${comment}" align="center" prop="status" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['kdshop:goods:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['kdshop:goods:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改商品对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="catelogId">
          <el-select v-model="form.catelogId" placeholder="请选择${comment}">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="${comment}" prop="userId">
          <el-select v-model="form.userId" placeholder="请选择${comment}">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="${comment}" prop="name">
          <el-input v-model="form.name" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="price">
          <el-input v-model="form.price" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="realPrice">
          <el-input v-model="form.realPrice" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="startTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="form.startTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="polishTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="form.polishTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="endTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="form.endTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="commetNum">
          <el-input v-model="form.commetNum" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="phoneNumber">
          <el-input v-model="form.phoneNumber" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="qqNumber">
          <el-input v-model="form.qqNumber" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="wxNumber">
          <el-input v-model="form.wxNumber" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="goodCity">
          <el-input v-model="form.goodCity" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="goodBuyMethod">
          <el-input v-model="form.goodBuyMethod" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="goodAddress">
          <el-input v-model="form.goodAddress" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="viewcount">
          <el-input v-model="form.viewcount" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="describle">
          <el-input v-model="form.describle" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}">
          <el-radio-group v-model="form.status">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listGoods, getGoods, delGoods, addGoods, updateGoods, exportGoods } from "@/api/kdshop/goods";

export default {
  name: "Goods",
  components: {
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 商品表格数据
      goodsList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        catelogId: null,
        userId: null,
        name: null,
        price: null,
        realPrice: null,
        startTime: null,
        polishTime: null,
        endTime: null,
        commetNum: null,
        phoneNumber: null,
        qqNumber: null,
        wxNumber: null,
        goodCity: null,
        goodBuyMethod: null,
        goodAddress: null,
        viewcount: null,
        describle: null,
        status: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        catelogId: [
          { required: true, message: "$comment不能为空", trigger: "change" }
        ],
        userId: [
          { required: true, message: "$comment不能为空", trigger: "change" }
        ],
        name: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        price: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询商品列表 */
    getList() {
      this.loading = true;
      listGoods(this.queryParams).then(response => {
        this.goodsList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        catelogId: null,
        userId: null,
        name: null,
        price: null,
        realPrice: null,
        startTime: null,
        polishTime: null,
        endTime: null,
        commetNum: null,
        phoneNumber: null,
        qqNumber: null,
        wxNumber: null,
        goodCity: null,
        goodBuyMethod: null,
        goodAddress: null,
        viewcount: null,
        describle: null,
        status: 0
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加商品";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getGoods(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改商品";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateGoods(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGoods(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$confirm('是否确认删除商品编号为"' + ids + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delGoods(ids);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      const queryParams = this.queryParams;
      this.$confirm('是否确认导出所有商品数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return exportGoods(queryParams);
        }).then(response => {
          this.download(response.msg);
        })
    }
  }
};
</script>
