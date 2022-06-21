<template>
  <div>
    <div class="divtop">
      <img src="../../assets/kkcd.png" class="imgLogo">
    </div>
    <div class="forgotCard">
      <h3>找回密码</h3>
      <el-input style="margin-top: 20px" placeholder="请输入用户名..."></el-input>
      <el-input style="margin-top: 10px;" placeholder="请输入邮箱..."></el-input>
      <div>
        <el-input class="inputCaptcha" placeholder="请输入验证码..."></el-input>
        <el-button style="margin-top: 10px;margin-left: 15px" type="info" plain class="sendEmail"
                   icon="el-icon-s-promotion" @click="showDialog">获取验证码
        </el-button>
      </div>
      <div class="buttonLoginAndRegister">
        <el-button type="text" style="color: darkgray;font-size: 2px" @click="goLogin">立即登录</el-button>
        <el-button type="text" style="color: darkgray;font-size: 2px;margin-left: 55%" @click="goRegister">没有账号，立即注册
        </el-button>
      </div>
    </div>

    <el-dialog
        title="请输入验证码"
        :visible.sync="dialogVisible"
        width="30%">
      <div class="captcha">
        <el-input type="text" v-model="submitForm.captchaCode" class="inputCaptcha2" placeholder="点击图片切换验证码"></el-input>
        <img src="../../assets/captcha.png" class="imgCaptcha">
      </div>

      <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
  </span>
    </el-dialog>
  </div>

</template>

<script>
export default {
  name: "Forgot",
  data() {
    return {
      dialogVisible: false,
      submitForm: {
        username: '',
        email: '',
        emailCode: '',
        captchaCode: ''
      }
    }
  },
  methods: {
    showDialog() {
      this.dialogVisible = true;
    },
    goLogin() {
      this.$router.push('/');
    },
    goRegister() {
      this.$router.push('/register')
    }
  }
}
</script>

<style scoped>

.forgotCard {
  text-align: center;
  margin: 100px auto;
  width: 400px;
  padding: 15px 15px 35px 15px;
  border: 1px solid #cdcdcd;
  border-radius: 15px;
  box-shadow: 0 0 25px #cfcfcf;

}

.header {
  display: flex;
}

.imgLogo {
  width: 80px;
  margin-left: 20px;
}

.captcha {
  margin-top: 10px;
  display: flex;
}

.imgCaptcha {
  width: 100px;
  margin-left: 10px;
}

.inputCaptcha {
  width: 250px;
  margin-top: 10px;
}

.inputCaptcha2 {
  width: 280px;
  margin-left: 30px;
}

.buttonLoginAndRegister {
  display: flex;
  margin-top: 10px;
}

</style>
