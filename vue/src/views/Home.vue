<template>
  <div class="divMain">

    <el-container>

      <el-header class="elHeader">
        <img src="../assets/logoWord.png" class="imgLogo">
        <img src="../assets/avatar.jpeg"  class="imgAvatar">
        <span  class="headerUserInfoUsername">欢迎您，{{userinfo.username}}</span>
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
        </el-aside>
        <el-container>
          <el-aside width="220px" class="elAside2">
            <ChosenFiles  v-show="button1Aside1"/>
            <ChosenTr     v-show="button2Aside1"/>
            <ChosenUser   v-show="button3Aside1"/>
          </el-aside>
          <el-main class="elMain">
<!--            <el-button type="text" icon="el-icon-delete" style="font-size: 50px"></el-button>-->
            <AllFiles/>
          </el-main>
        </el-container>

      </el-container>

    </el-container>
  </div>

</template>

<script>
import ChosenFiles from "../components/Home/aside/ChosenFiles";
import ChosenTr from "../components/Home/aside/ChosenTr";
import ChosenUser from "../components/Home/aside/ChosenUser";
import AllFiles from "../components/Home/main/chosenFiles/AllFiles";
  export default {
    name: "Home",
    components:{
      ChosenFiles,ChosenTr,ChosenUser,
      AllFiles
    },
    data(){
      return{
        userinfo:{
          username:'管理员'
        },
        button1Aside1: true,
        button2Aside1: false,
        button3Aside1: false
      }
    },
    methods:{
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
  border-radius: 40px;
  padding: 1px;
  border: 1px solid #1e90ff;
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
  height: 880px;
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


</style>
