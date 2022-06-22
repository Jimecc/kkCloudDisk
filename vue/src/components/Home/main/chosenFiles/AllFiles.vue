<template>
  <div>
    <div >
      <div class="divButtonUpload">
        <el-input placeholder="请输入文件名..." class="elInputFileName"></el-input>
        <el-button type="primary" icon="el-icon-search" class="elButtonSearch">&nbsp;搜索文件&nbsp;</el-button>
        <el-button type="primary" round size="small"  class="buttonUpload"><i class="el-icon-upload" style="font-size: 16px;padding: 2px"></i>&emsp;上传文件&emsp;</el-button>
        <el-button type="primary" round size="small" class="buttonAddFolder"><i class="el-icon-folder-add" style="font-size: 16px;padding: 2px"></i>&emsp;新建文件夹&emsp;</el-button>
      </div>
      <div class="Breadcrumb" >
        <el-button type="text" style="color:darkgray;margin-left: 5px;margin-right: 5px" content-position="center">回到首页</el-button>
        <el-divider direction="vertical"></el-divider>
        <el-button type="text" style="color:darkgray;margin-left: 5px;margin-right: 5px">上级目录<i class="el-icon-arrow-right el-icon--right"></i></el-button>
        <el-breadcrumb style="margin-right: 5px">
          <el-breadcrumb-item>abc</el-breadcrumb-item>
          <el-breadcrumb-item>123</el-breadcrumb-item>
          <el-breadcrumb-item>123</el-breadcrumb-item>
        </el-breadcrumb>
      </div>
    </div>
    <div class="divFiles" >

      <div class="divIconFile"  v-for="i in 100" :key="i">
        <el-card class="elCardFile" shadow="hover">
          <img class="imgFile" src="../../../../assets/fileIcons/yellowfile.png">
          <el-button type="text" class="buttonFileName">{{i*100000}}</el-button>
          <div class="fileInfo">
            <span>id:{{i}}</span><br>
            <span>{{ currentDay }}</span>
          </div>
        </el-card>


<!--        <div v-if="i<5">-->
<!--          <img class="imgFile" src="../../../../assets/fileIcons/yellowfile.png">-->
<!--        </div>-->
<!--        <div v-if="i>=5">-->
<!--          <img class="imgFile" src="../../../../assets/fileIcons/yellowfile.png">-->
<!--        </div>-->
<!--        <div>-->
<!--          <span class="spanFileName">{{i}}</span>-->
<!--        </div>-->
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "AllFiles",
    data(){
      return{
        currentDay:new Date()
      }
    }
  }
</script>

<style scoped>
.Breadcrumb{
  margin: 10px 0 0 5px;
  display: flex;
  align-items: center;
  font-size: 13px;
}
/*上传 新建文件夹*/
.divButtonUpload{
  display: flex;
  align-items: center;
  width: 100%;
}
.buttonAddFolder{
  background: #f0fbfe;
  color: #09a7ff;
  border: 1px solid #f0fbfe;
  height: 38px;
  margin-left: 30px;
  font-size: 16px;
}

buttonUpload{
  margin-left: 20px;
  font-size: 16px;
  border: 1px solid #f0fbfe;
  height: 38px;
}

.divFiles{
  display: flex;
  width: 100%;
  justify-content: left;
  text-align: center;
  flex-wrap: wrap;

}

.divIconFile{
  padding: 8px;

}
.imgFile{
  width: 55px;
}
.spanFileName{
  margin-top: -5px;
}
.elCardFile{
  width: 140px;
  height: 200px;
  margin: 20px 20px 20px 20px;
  /*box-shadow: 0 0 5px #ececec;*/
  border-radius: 15px;
  border: 0 solid #fff;

}
.fileInfo{
  justify-content: left;
  text-align: left;
  color: #d4d4d4;
  font-size: 13px;
  margin: 0 0 0 5px;

}
.buttonFileName{
  color: #666666;
  font-size: 16px;
}
.elInputFileName{
  width: 300px;
  margin-left: 10px;
}
.elButtonSearch{
  margin-left: 20px;
  height: 38px;
}
</style>
