<template>
  <div>
    <el-container>
      <el-aside width="220px" class="elAside2">
        <div v-show="true">
          <img src="../../../assets/aside2/menu2/recentlyShare.png" class="buttonAside2" style="margin-top: 20px">
        </div>
      </el-aside>
      <el-main class="elMain">
        <div style="margin-top: 10px">
          <FileShare/>
        </div>

      </el-main>
    </el-container>

  </div>
</template>


<script>
import FileShare from "./FileShare";
export default {
  name: "MajorMenuShare",
  components:{
    FileShare
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
