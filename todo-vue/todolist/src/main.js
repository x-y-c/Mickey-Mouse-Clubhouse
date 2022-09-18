import {createApp} from 'vue'
import './style.css'
import 'pattern.css'
import App from './App.vue'
import naive from 'naive-ui'

const app = createApp(App).use(naive).mount('#app')