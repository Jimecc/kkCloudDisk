<template>
  <div>
    <div class="buttonAside2">
      <img src="../../../assets/aside2/menu1/allFiles1.png" class="buttonAside2" v-if="!buttons.allFiles" @click="clickAll" style="margin-top: 20px">
      <img src="../../../assets/aside2/menu1/allFiles2.png" class="buttonAside2" v-if="buttons.allFiles" style="margin-top: 20px">
      <img src="../../../assets/aside2/menu1/docs1.png" class="buttonAside2" v-if="!buttons.docs" @click="clickDocs">
      <img src="../../../assets/aside2/menu1/docs2.png" class="buttonAside2" v-if="buttons.docs">
      <img src="../../../assets/aside2/menu1/imgs1.png" class="buttonAside2" v-if="!buttons.imgs" @click="clickImgs">
      <img src="../../../assets/aside2/menu1/imgs2.png" class="buttonAside2" v-if="buttons.imgs">
      <img src="../../../assets/aside2/menu1/videos1.png" class="buttonAside2" v-if="!buttons.videos" @click="clickVideos">
      <img src="../../../assets/aside2/menu1/videos2.png" class="buttonAside2" v-if="buttons.videos">
      <img src="../../../assets/aside2/menu1/sounds1.png" class="buttonAside2" v-if="!buttons.sounds" @click="clickSounds">
      <img src="../../../assets/aside2/menu1/sounds2.png" class="buttonAside2" v-if="buttons.sounds">
      <img src="../../../assets/aside2/menu1/others1.png" class="buttonAside2" v-if="!buttons.others" @click="clickOthers">
      <img src="../../../assets/aside2/menu1/others2.png" class="buttonAside2" v-if="buttons.others">
      <el-divider style="margin-left: 0px"></el-divider>
      <img src="../../../assets/aside2/menu1/bin1.png" class="buttonAside2" v-if="!buttons.bin" @click="clickBin">
      <img src="../../../assets/aside2/menu1/bin2.png" class="buttonAside2" v-if="buttons.bin">

    </div>
<!--    <div style="margin-top: 330%" class="divCapacity">-->
<!--      <span style="margin-left: 12px">容量：</span>-->
<!--      <el-progress :percentage="capacity" class="buttonAside2"></el-progress>-->
<!--    </div>-->


  </div>
</template>

<script>
  export default {
    name: "ChosenFiles",
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
       capacity:57.23
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
      }
    }
  }
</script>

<style scoped>
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
