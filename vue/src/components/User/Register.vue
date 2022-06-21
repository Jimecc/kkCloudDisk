<template>
  <div>
    <div class="header">
      <img src="../../assets/kkcd.png" class="imgLogo">
    </div>
    <div class="divAvatar">
      <img class="avatar" src="https://files.catbox.moe/3wapon.jpeg">
    </div>

    <div class="divForm">
      <el-input tepe="text" style="margin-top: 67px" v-model="registerForm.nickname" placeholder="请输入昵称..."></el-input>
      <el-input tepe="text" style="margin-top: 10px" v-model="registerForm.username" placeholder="请输入用户名..."></el-input>
      <el-input tepe="text" style="margin-top: 10px" v-model="registerForm.password" placeholder="请输入密码..."></el-input>
      <el-input tepe="text" style="margin-top: 10px" v-model="registerForm.confirmPassword"
                placeholder="确认密码..."></el-input>
      <el-input tepe="text" style="margin-top: 10px" v-model="registerForm.email" placeholder="请输入邮箱..."></el-input>
      <el-input tepe="text" style="margin-top: 10px" v-model="registerForm.email" placeholder="请输入6位数验证码..."
                class="inputCode"></el-input>
      <el-button type="info" plain class="sendEmail" icon="el-icon-s-promotion">获取验证码</el-button>
      <div>
        <el-button type="primary" class="submitForm">注&emsp;&emsp;册</el-button>
      </div>
      <div class="buttonLoginAndRegister">
        <el-button type="text" style="color: darkgray;font-size: 2px" @click="goLogin">已有账号，立即登录</el-button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Register",
  data() {
    return {
      registerForm: {
        nicknam: '',
        username: '',
        password: '',
        confirmPassword: '',
        email: ''
      }
    }
  },// data
  methods: {
    goLogin() {
      this.$router.push('/');
    }
  }
}
</script>

<style scoped>

.divAvatar {
  text-align: center;
  margin-top: 40px;
}

.divForm {
  text-align: center;
  margin: -55px auto;
  width: 350px;
  height: 450px;
  padding: 15px 15px 35px 15px;
  border: 1px solid #cdcdcd;
  border-radius: 15px;
  box-shadow: 0 0 25px #e2e2e2;
}

.avatar {
  width: 100px;
  background: #fff;
  border-radius: 100px;
  border: 2px solid #cdcdcd;
  padding: 5px 5px 5px 5px;
  box-shadow: 0 0 25px #e2e2e2;
}

.inputCode {
  width: 200px;
}

.sendEmail {
  width: 140px;
  margin-left: 10px;
}

.header {
  display: flex;
}

.imgLogo {
  width: 80px;
  margin-left: 20px;
}

.submitForm {
  width: 100%;
  margin-top: 22px;
}

.buttonLoginAndRegister {
  display: flex;
  margin-top: 10px;
}

</style>
