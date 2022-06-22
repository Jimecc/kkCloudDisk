<template>
  <div>
    <el-container>
      <el-aside width="220px" class="elAside2">
        <div v-if="true" class="buttonAside2">
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
        <!--            <ChosenFiles  v-show="button1Aside1"/>-->
        <!--            <ChosenTr     v-show="button2Aside1"/>-->
        <div v-show="button2Aside1">
          <img src="../../../assets/aside2/menu2/recentlyShare.png" class="buttonAside2" style="margin-top: 20px">
        </div>
<!--        <ChosenUser   v-show="button3Aside1"/>-->
        <!--            <div style="margin-top: 330%" class="divCapacity">-->
        <!--              <span style="margin-left: 12px">容量：</span>-->
        <!--              <el-progress :percentage="capacity" class="buttonAside2"></el-progress>-->
        <!--            </div>-->
      </el-aside>
      <el-main class="elMain">
        <!-- 以下 Div 目前仅用于调试 -->
        <div style="margin-top: 10px">
          <FilesAll v-if="buttons.allFiles"/>
          <FilesDocs v-if="buttons.docs"/>
        </div>

      </el-main>
    </el-container>
  </div>
</template>

<script>
import FilesAll from "./FilesAll";
import FilesDocs from "./FilesDocs";
export default {
  name: "MajorMenuFiles",
  components:{
    FilesAll,FilesDocs
  },
  data() {
    return {
      buttons: {
        allFiles: true,
        imgs: false,
        videos: false,
        docs: false,
        sounds: false,
        others: false,
        bin: false
      }
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




.elAside2{
  border: 1px solid #d7d7d7;
}


/*MAIN*/
.elMain{
  height: 900px;
}
.buttonAside2{
  height: 40px;
  /*width: 150px;*/
  margin-left: 10px;
  margin-top: 6px;
  border-radius: 25px;


}

</style>
