<template>
  <div class="container">
    <img class="logo" alt="logo" src="./assets/json.png">
    <Container @plus="count++" :count="count" :posts="posts"/>
    <!-- <h1> {{ connectData }}</h1> -->
    <!-- 로그찍기용 임시 -->
    <p>할 일 : {{ count }} 개 </p>
  </div>  
</template>

<script>
import Container from './components/Container.vue';

export default {
  name: 'App',
  components: {
    Container : Container
  },
  data(){
    return {
      posts : [{
      }], 
      count : 0,
      text : '',
    }
  },
  mounted(){
    console.log("test")
    this.toss();
  },
  methods: {
    toss(){
      // this.axios.get('/test')
      this.axios.get('/all')
      .then( (res) => {
        this.posts = res.data;

        // 이거 쓰고 싶은데 안됨 ㅠㅠ 
        // console.log("길이 "+ this.posts.length)
        // this.count = this.posts.length;
        console.log(res.data);
        console.log(this.count);

      })
      .catch( (err)=>{
        console.error(err);
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
