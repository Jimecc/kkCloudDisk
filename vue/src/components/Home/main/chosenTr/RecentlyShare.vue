<template>
  <div>

    <div  class="topDiv">
      <h3>最近分享</h3>
    </div>

    <el-divider></el-divider>
    <div class="outDiv">

      <div class="leftDiv">
        <ul class="infinite-list" v-infinite-scroll="load" style="overflow:auto">
          <li v-for="i in count" class="infinite-list-item">
            <el-card class="shareInfo">
          <span style="width: 35px;">
            {{i}}
          </span>
              <el-divider direction="vertical"></el-divider>
              <el-button type="text" style="color: #484848" icon="el-icon-copy-document"></el-button>
              <el-divider direction="vertical"></el-divider>
                <el-popover
                    placement="top-start"
                    :title="title"
                    width="150"
                    trigger="hover">

                  <el-button type="text" style="color: #484848" icon="el-icon-view" slot="reference">hover 激活</el-button>
                  <div>
                    <img src="../../../../assets/avatar.jpeg" class="view">
                    <el-divider style="padding: 0px 5px"></el-divider>
                    <div>

                    </div>
                  </div>
                </el-popover>

<!--                <el-button type="text" style="color: #484848" icon="el-icon-view"></el-button>-->
              <el-divider direction="vertical"></el-divider>
              <el-button type="text" style="color: #484848" icon="el-icon-delete"></el-button>
              <el-divider direction="vertical"></el-divider>
              <span style="border-radius: 5px">
                已经下载了{{i}}次
              </span>
              <el-divider direction="vertical"></el-divider>
              <span style="background: #d2d2d2;border-radius: 5px">
                https://blog.csdn.net/anny_mei/article/details/107413147
              </span>
              <!--          <el-divider direction="vertical"></el-divider>-->

              <!--          <span style="width: 52px;background: #b8b8b8;margin-left: 1%">-->
              <!--            233456-->
              <!--          </span>-->

            </el-card>
          </li>
        </ul>

      </div>

<!--      修改文件预览效果，改为弹窗预览，以下代码作废-->
<!--      <div class="rightDiv">-->
<!--        <div class="rightInDiv">-->
<!--          <div class="rightTitle">-->
<!--            <b>文件预览</b>-->
<!--          </div>-->
<!--          <el-divider></el-divider>-->
<!--          <div class="rightBody">-->

<!--          </div>-->
<!--          <div class="rightFloor">-->

<!--          </div>-->

<!--        </div>-->

<!--      </div>-->
    </div>
  </div>
</template>

<script>
  export default {
    name: "RecentlyShare",
    data(){
      return{
        value:true,
        count: 0,
        title:'avarar.png'
      }
    },
    methods:{
      load () {
        this.count += 2
      }
    }
  }
</script>

<style scoped>
.outDiv{
  display: flex;
  margin-top: 10px;
}
.leftDiv{
  width: 100%;
}
.rightDiv{
  /*background: #b8b8b8;*/
  width: 280px;
  height: 500px;
}
.rightInDiv{
  width: 250px;
  height: 650px;
  margin-left: 10px;
  border-radius: 20px;
  border: 1px solid #b8b8b8;
  /*box-shadow: 0 0 25px #b8b8b8;*/
}

.topDiv{
  height: 20px;
  width: 100%;
}

.rightTitle{
  text-align: center;
  margin-top: 15px;
  font-size: 15px;
}
.shareInfo{
  margin-top: 10px;
  border-radius: 10px;
  width: 100%;
  height: 45px;
  justify-content: space-between;
  align-items: center;
  display: flex;
  font-size: 6px;
  background: #f6f6f6;
}
.view{
  width: 150px;
}
</style>
