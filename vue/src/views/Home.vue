<template>
  <div>
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
                <el-divider style="padding: 2px 0px"></el-divider>
                <div>
                  <el-button type="text" style="font-size:13px;color:#a5a5a5;padding: 2px 2px">个人中心</el-button>
                </div>
                <div>
                  <el-button type="text" style="font-size:13px;color:#a5a5a5;margin:2px 2px;padding: 2px 2px">修改密码</el-button>
                </div>
                <div>
                  <el-button type="text" style="font-size:13px;color:#a5a5a5;padding: 2px 2px">设置</el-button>
                </div>
                <div>
                  <el-button type="text" style="font-size:13px;color:#a5a5a5;padding: 2px 2px" @click="logout">退出登录</el-button>
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
        <el-aside width="75px" class="elAside">
          <div @click="clickHomeButton1Aside1">
            <img v-if="buttonMenu1" src="../assets/aside1/home2.png" class="sideImg">
            <img v-if="!buttonMenu1" src="../assets/aside1/home1.png" class="sideImg">
          </div>
          <div @click="clickHomeButton2Aside1">
            <img v-if="buttonMenu2" src="../assets/aside1/tr2.png" class="sideImg">
            <img v-if="!buttonMenu2" src="../assets/aside1/tr1.png" class="sideImg">
          </div>
          <div @click="clickHomeButton3Aside1">
            <img v-if="buttonMenu3" src="../assets/aside1/user2.png" class="sideImg">
            <img v-if="!buttonMenu3" src="../assets/aside1/user1.png" class="sideImg">
          </div>
        </el-aside>

        <el-main class="elMain">
          <Major1 v-if="buttonMenu1"/>
          <Major2 v-if="buttonMenu2"/>
          <Major3 v-if="buttonMenu3"/>
        </el-main>

      </el-container>

    </el-container>
  </div>
</template>

<script>
import Major1 from "../components/Menus/Menu1/_MajorMenuFiles";
import Major2 from "../components/Menus/Menu2/_MajorMenuShare";
import Major3 from "../components/Menus/Menu3/_MajorMenuManage";
  export default {
    name: "Home",
    components:{
      Major1,Major2,Major3
    },
    data(){
      return{
        vis:false,
        userinfo:{
          nickname:'无恶不作的张三',
          username:'123'
        },
        buttonMenu1: true,
        buttonMenu2: false,
        buttonMenu3: false
      }
    },
    methods:{
      logout(){
        this.$router.replace('/');
      },
      clickHomeButton1Aside1(){
        this.buttonMenu1 = true;
        this.buttonMenu2 = false;
        this.buttonMenu3 = false;
      },
      clickHomeButton2Aside1(){
        this.buttonMenu1 = false;
        this.buttonMenu2 = true;
        this.buttonMenu3 = false;
      },
      clickHomeButton3Aside1(){
        this.buttonMenu1 = false;
        this.buttonMenu2 = false;
        this.buttonMenu3 = true;
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
  width: 32px;
  border-radius: 80px;
  padding: 2px;
  border: 1px solid #1e90ff;
}
.placeAvatar{
  margin-left: 76%;
}
.headerUserInfoUsername{
  font-size: 14px;
  margin-left: 10px;
  margin-right: 10px;
}
/*ASIDE*/
.elAside{
  height: 900px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #e3e3e3;
}
.sideImg{
  width: 35px;
  margin-left: 20px;
  margin-top: 15px;
}
.elMain{
  margin: -18px 0 0 -20px ;
}
</style>
