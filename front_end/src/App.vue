<template>
  <div class="container">
    <img class="logo" alt="logo" src="./assets/json.png">
    <List :connectData="connectData"/>
    <!-- <h1> {{ connectData }}</h1> -->
  </div>  
</template>

<script>
import List from './components/List.vue';

export default {
  name: 'App',
  components: {
    List : List
  },
  data(){
    return {
      connectData : [], 
    }
  },
  mounted(){
    console.log("test")
    this.toss();
  },
  methods: {
    toss(){
      console.log("여기?");
      this.axios.get('/test')
      .then( (res) => {
        this.connectData = res.data;
        console.log(res.data);
      })
      .catch( (err)=>{
        console.error(err)
      })

  }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

body{
  height: 100vh;
  background-color: #feffe5;
  background-size: cover;
}

.logo{
  width: 20%;
  height: 20%;
  background-image: url('./assets/json.png');
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
  margin: 10px;
}

.container{
  width: 50%;
  height: 50%;
  background-color: white;
  border-radius: 10px;
  box-shadow: 3px 3px 3px 3px gray;
}
</style>
