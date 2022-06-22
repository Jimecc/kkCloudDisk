<template>

  <div>
    <el-form ref="form" :model="loginForm" class="loginContainer">
      <font color="darkgray" size="2px">欢迎使用&nbsp;<el-button type="text" @click="openPage"
                                                             style="font-size:2px;color:#1e90ff">可可云盘
      </el-button>
      </font>

      <div class="titleAndAvatar">
        <h3 class="loginTitle">系统登录</h3>
        <img class="logo" src="../assets/logokkcd.png">
      </div>
      <el-form-item>
        <el-input type="text" v-model="loginForm.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item>
        <el-input type="password" v-model="loginForm.password" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-input class="inputCode" type="text" v-model="loginForm.code" placeholder="请输入验证码"></el-input>
        <img :src="captchaURL">
      </el-form-item>
      <div class="registAndSubmit">
        <el-checkbox class="loginRemember" v-model="checked">记住我</el-checkbox>
        <el-button size="small" class="buttonRegist" type="text" @click="goRegister">注册</el-button>
        <el-button size="small" class="buttonForget" type="text" @click="goForgot">忘记密码</el-button>
      </div>
      <el-button class="submitButton" type="primary" @click="submitForm">登录</el-button>
    </el-form>

  </div>
</template>

<script>
import Register from "./User/Register";

export default {
  name: "Login",
  components: {
    Register
  },
  data() {
    return {
      loginForm: {
        username: '',
        password: '',
        code: ''
      },
      checked: true,
      captchaURL: '../../assets/captcha.png',

    }
  },
  methods: {
    openPage() {
      window.open('https://github.com/Jimecc/kkCloudDisk');
    },
    submitForm() {
      this.$router.push('/home');
    },
    goRegister() {
      this.$router.push('/register')
    },
    goForgot() {
      this.$router.push('/forgot');
    }

  }
}
</script>

<style scoped>
.submitButton {
  width: 100%;
  /*margin-top: 10px;*/
}

.loginContainer {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 180px auto;
  width: 350px;
  padding: 40px 35px 35px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}

.loginTitle {
  text-align: left;

}

.inputCode {
  width: 250px;
  margin-right: 10px;
}

.loginRemember {
  text-align: left;
  margin: 0px 0px 15px 0px;
}

.logo {
  width: 60px;
  height: 60px;
  margin-top: 0px;
  border-radius: 30px;
  text-align: right;
  margin-left: 60%;
}

.titleAndAvatar {
  display: flex;
}

.registAndSubmit {
  display: flex;
  color: gray;
}

.buttonRegist {
  color: darkgray;
  margin-left: 55%;
}

.buttonForget {
  color: darkgray;
}
</style>
