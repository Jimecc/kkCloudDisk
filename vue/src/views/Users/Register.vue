<template>
  <div>
    <RegisterComponent v-if="true"/>
    <!--    <ForgotCard v-if="true"/>-->
  </div>
</template>

<script>
import RegisterComponent from "../../components/User/Register.vue";
import ForgotCard from "./Forgot";

export default {
  name: "Register",
  components: {
    RegisterComponent,
    ForgotCard
  }
}
</script>

<style scoped>

</style>
