<template>
  <div>
    <div>
      <el-input size="small" v-model="searchUsername" placeholder="请输入用户名查询..." style="width: 400px">
        <template slot="prepend">用户名：</template>
      </el-input>
      <el-button icon="el-icon-search" type="primary" style="margin-left: 10px" size="small">搜索</el-button>
      <el-button icon="el-icon-plus" type="info" plain style="margin-left: 50%" size="small" @click="showElCard=!showElCard">添加用户</el-button>
    </div>

    <div class="divImage">
      <img  src="../../../../assets/avatar.jpeg" class="image">

      <el-card shadow="hover" :body-style="{ padding: '0px' }" class="elCard">
        <div class="divInElCard">
          <div class="cardTitle">
            <b>{{ userInfo.nickname }}</b>
          </div>
          <div class="infoInCard">
            <div>用户名：{{userInfo.username}}</div>
            <div>简介：{{userInfo.userInfo}}</div>
            <div>
              启用状态：
              <el-switch
                  v-model="userInfo.enabled"
                  active-color="#13ce66"
                  inactive-color="darkgray">
              </el-switch>
            </div>
          </div>
          <div style="margin-top: 4px;text-align: right">
            <el-button type="text" class="handleInCard" >删除</el-button>
          </div>
        </div>
      </el-card>
    </div>
  </div>

</template>

<script>
export default {
  name: "RegulateUsers",
  data(){
    return{
      showElCard: false,
      searchUsername:'',
      userInfo: {
          nickname:'法外狂徒张三',
          username:'123',
          userInfo:'不是什么好人',
          enabled:true
        },
      userInfoList:[
          {
            nickname:'法外狂徒张三',
            username:'123',
            enabled:true
          },
        {
          nickname:'法外狂徒张三',
          username:'123',
          enabled:true
        },
        {
          nickname:'法外狂徒张三',
          username:'123',
          enabled:true
        },
      ]

    }
  }
}
</script>

<style scoped>
.divImage{
  margin-top: 40px;
  width: 250px;
  height: 250px;
}
.image{
  width: 90px;
  border-radius: 50px;
  padding: 2px;
  border: 1px solid #e3e3e3;
  background: #fff;
  box-shadow: 0 0 20px #b8b8b8;
  margin-left: 85px;
}
.elCard{
  width: 250px;
  height: 250px;
  margin-left: 10px;
  border-radius: 15px;
  margin-top: -35px;
  border: 1px solid #cfcfcf;
}
.divInElCard{
  padding: 14px;
  margin-top: 19px;
}
.cardTitle{
  width: 100%;
  text-align: center;
}
.infoInCard{
  font-size: 13px;
  color: dodgerblue;
  width: 100%;
  height: 100px;
  text-align: left;
  margin-top: 15px;
  padding: 15px 15px 15px 15px;
}
.handleInCard{
  color: #ff7474;
  margin-right: 15px;
}
</style>
