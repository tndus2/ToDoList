<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <List/>
  <h1> {{ connectData }}</h1>
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
      connectData : "", 
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
      .catch( ()=>{
        console.log('fail')
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
</style>
