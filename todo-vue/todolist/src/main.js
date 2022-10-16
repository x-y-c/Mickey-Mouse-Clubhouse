import {createApp} from 'vue'
import './style.css'
import 'pattern.css'
import App from './App.vue'
import naive from 'naive-ui'
import axios from "axios";
import VueAxios from "vue-axios";

const app = createApp(App).use(naive).use(VueAxios).mount('#app')