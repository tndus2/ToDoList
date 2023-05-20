import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios';
import router from './router/index.js';

//axios.defaults.baseURL = "http://localhost:4860";

const app = createApp(App)

app.config.globalProperties.axios = axios;
app.use(router).mount('#app'); 

