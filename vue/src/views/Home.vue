<template>
  <div class="divMain">

    <el-container>

      <el-header class="elHeader">
        <img src="../assets/logoWord.png" class="imgLogo">
        <el-popover class="placeAvatar"
            placement="bottom"
            width="150"
            trigger="click"
            v-model="vis">
          <img src="../assets/avatar.jpeg"  slot="reference" class="imgAvatar" >
          <div style="text-align: left;margin-top: 12px">
            <div style="text-align: center">
              <h3>{{userinfo.nickname}}</h3>
            </div>
            <el-divider style="padding: 0px 0px"></el-divider>
            <div>
              <el-button type="text">个人中心</el-button>
            </div>
            <div>
              <el-button type="text">修改密码</el-button>
            </div>
            <div>
              <el-button type="text">退出登录</el-button>
            </div>
            <div>
              <el-button type="text">设置</el-button>
            </div>
          </div>
        </el-popover>
        <span  class="headerUserInfoUsername">{{userinfo.nickname}}</span>
        <el-divider direction="vertical"></el-divider>
        <el-button style="font-size: 16px;color:gray;font-weight: bold;margin-left: 10px" type="text" icon="el-icon-sort"></el-button>
        <el-button style="font-size: 16px;color:gray;font-weight: bold;margin-left: 15px" type="text" icon="el-icon-chat-dot-round"></el-button>
        <el-button style="font-size: 16px;color:gray;font-weight: bold;margin-left: 15px" type="text" icon="el-icon-switch-button" @click="logout"></el-button>
      </el-header>

      <el-container>
        <el-aside width="75px" class="elAside1">
          <div @click="clickHomeButton1Aside1">
            <img v-if="button1Aside1" src="../assets/aside1/home2.png" class="side1Img">
            <img v-if="!button1Aside1" src="../assets/aside1/home1.png" class="side1Img">
          </div>
          <div @click="clickHomeButton2Aside1">
            <img v-if="button2Aside1" src="../assets/aside1/tr2.png" class="side1Img">
            <img v-if="!button2Aside1" src="../assets/aside1/tr1.png" class="side1Img">
          </div>
          <div @click="clickHomeButton3Aside1">
            <img v-if="button3Aside1" src="../assets/aside1/user2.png" class="side1Img">
            <img v-if="!button3Aside1" src="../assets/aside1/user1.png" class="side1Img">
          </div>
<!--          <div @click="openGithub">-->
<!--            <img src="../assets/githubAvatar.jpeg" class="imgGithub">-->
<!--          </div>-->
        </el-aside>
        <el-container>
          <el-aside width="220px" class="elAside2">
            <div v-if="button1Aside1" class="buttonAside2">
              <img src="../assets/aside2/menu1/allFiles1.png" class="buttonAside2" v-if="!buttons.allFiles" @click="clickAll" style="margin-top: 20px">
              <img src="../assets/aside2/menu1/allFiles2.png" class="buttonAside2" v-if="buttons.allFiles" style="margin-top: 20px">
              <img src="../assets/aside2/menu1/docs1.png" class="buttonAside2" v-if="!buttons.docs" @click="clickDocs">
              <img src="../assets/aside2/menu1/docs2.png" class="buttonAside2" v-if="buttons.docs">
              <img src="../assets/aside2/menu1/imgs1.png" class="buttonAside2" v-if="!buttons.imgs" @click="clickImgs">
              <img src="../assets/aside2/menu1/imgs2.png" class="buttonAside2" v-if="buttons.imgs">
              <img src="../assets/aside2/menu1/videos1.png" class="buttonAside2" v-if="!buttons.videos" @click="clickVideos">
              <img src="../assets/aside2/menu1/videos2.png" class="buttonAside2" v-if="buttons.videos">
              <img src="../assets/aside2/menu1/sounds1.png" class="buttonAside2" v-if="!buttons.sounds" @click="clickSounds">
              <img src="../assets/aside2/menu1/sounds2.png" class="buttonAside2" v-if="buttons.sounds">
              <img src="../assets/aside2/menu1/others1.png" class="buttonAside2" v-if="!buttons.others" @click="clickOthers">
              <img src="../assets/aside2/menu1/others2.png" class="buttonAside2" v-if="buttons.others">
              <el-divider style="margin-left: 0px"></el-divider>
              <img src="../assets/aside2/menu1/bin1.png" class="buttonAside2" v-if="!buttons.bin" @click="clickBin">
              <img src="../assets/aside2/menu1/bin2.png" class="buttonAside2" v-if="buttons.bin">
            </div>
<!--            <ChosenFiles  v-show="button1Aside1"/>-->
<!--            <ChosenTr     v-show="button2Aside1"/>-->
            <div v-show="button2Aside1">
              <img src="../assets/aside2/menu2/recentlyShare.png" class="buttonAside2" style="margin-top: 20px">
            </div>
            <ChosenUser   v-show="button3Aside1"/>
<!--            <div style="margin-top: 330%" class="divCapacity">-->
<!--              <span style="margin-left: 12px">容量：</span>-->
<!--              <el-progress :percentage="capacity" class="buttonAside2"></el-progress>-->
<!--            </div>-->
          </el-aside>
          <el-main class="elMain">
            <div style="margin-top: 10px">
<!--              <RegulateUsers/>-->
              <RecentlyShare/>
            </div>

<!--            <AllFiles v-if="this.buttons.allFiles"/>-->
<!--            <Bin v-if="this.buttons.bin"/>-->

          </el-main>
        </el-container>

      </el-container>

    </el-container>
  </div>

</template>

<script>
// import ChosenFiles from "../components/Home/aside/ChosenFiles";
import ChosenTr from "../components/Home/aside/ChosenTr";
import ChosenUser from "../components/Home/aside/ChosenUser";
import AllFiles from "../components/Home/main/chosenFiles/AllFiles";
import Bin from "../components/Home/main/chosenFiles/Bin";
import RegulateUsers from "../components/Home/main/chosenUser/RegulateUsers";
import RecentlyShare from "../components/Home/main/chosenTr/RecentlyShare";
  export default {
    name: "Home",
    components:{
      // ChosenFiles,
      ChosenTr,ChosenUser,
      AllFiles,Bin,
      RecentlyShare,
      RegulateUsers
    },
    data(){
      return{
        buttons:{
          allFiles:true,
          imgs    :false,
          videos  :false,
          docs    :false,
          sounds  :false,
          others  :false,
          bin     :false
        },
        vis:false,
        capacity:57.23,
        userinfo:{
          nickname:'无恶不作的张三',
          username:'123'
        },
        button1Aside1: true,
        button2Aside1: false,
        button3Aside1: false
      }
    },
    methods:{
      clickAll(){
        this.clickButton("allFiles");
      },
      clickImgs(){
        this.clickButton("imgs");
      },
      clickVideos(){
        this.clickButton("videos");
      },
      clickDocs(){
        this.clickButton("docs");
      },
      clickSounds(){
        this.clickButton("sounds");
      },
      clickOthers(){
        this.clickButton("others");
      },
      clickBin(){
        this.clickButton("bin");
      },
      clickButton(buttonName){
        this.buttons.allFiles = false;
        this.buttons.imgs     = false;
        this.buttons.videos   = false;
        this.buttons.docs     = false;
        this.buttons.sounds   = false;
        this.buttons.others   = false;
        this.buttons.bin      = false;
        if(buttonName == "allFiles"){
          this.buttons.allFiles = true;
        }
        if(buttonName == "imgs"){
          this.buttons.imgs = true;
        }
        if(buttonName == "videos"){
          this.buttons.videos = true;
        }
        if(buttonName == "docs"){
          this.buttons.docs = true;
        }
        if(buttonName == "sounds"){
          this.buttons.sounds = true;
        }
        if(buttonName == "others"){
          this.buttons.others = true;
        }
        if(buttonName == "bin"){
          this.buttons.bin = true;
        }
      },
      logout(){
        this.$router.replace('/');
      },
      clickHomeButton1Aside1(){
        this.button1Aside1 = true;
        this.button2Aside1 = false;
        this.button3Aside1 = false;
      },
      clickHomeButton2Aside1(){
        this.button1Aside1 = false;
        this.button2Aside1 = true;
        this.button3Aside1 = false;
      },
      clickHomeButton3Aside1(){
        this.button1Aside1 = false;
        this.button2Aside1 = false;
        this.button3Aside1 = true;
      },
      openGithub(){
        window.open('https://github.com/Jimecc/kkCloudDisk');
      }
    }
  }
</script>

<style scoped>
.elHeader{
  text-align: right;
  background: #fff;
  display: flex;
  align-items: center;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}

.imgLogo{
  width: 100px;
  margin-left: 5px;
  margin-top: 2px;
}
.imgAvatar{
  width: 30px;
  border-radius: 80px;
  padding: 1px;
  border: 1px solid #1e90ff;

}
.placeAvatar{
  margin-left: 76%;
}
.headerUserInfoUsername{
  font-size: 14px;
  /*margin-top: 15px;*/
  margin-left: 10px;
  margin-right: 10px;
}
.headerLoading{
  margin-right: 10px;
  font-size: 118px;
}




/*ASIDE*/
.elAside1{
  height: 900px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #e3e3e3;
}
.elAside2{
  border: 1px solid #d7d7d7;
}

.asideIcon{
  margin-left: 5px;
}

/*MAIN*/
.elMain{
  height: 950px;
}
.elFooter{
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 -5px 25px #e3e3e3;
}
.side1Img{
  width: 35px;
  margin-left: 20px;
  margin-top: 15px;
}
/*.divCapacity{*/
/*  background: #fff;*/
/*  border: 1px solid #eaeaea;*/
/*  box-shadow: 0 0 50px #e3e3e3;*/
/*  border-radius: 10px;*/
/*}*/

.imgGithub{
  width: 40px;
  border-radius: 20px;
  margin-left: 5px;
}
.buttonAside2{
  height: 40px;
  /*width: 150px;*/
  margin-left: 10px;
  margin-top: 6px;
  border-radius: 25px;


}

.divCapacity{
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 50px #e3e3e3;
  border-radius: 10px;
}

</style>
