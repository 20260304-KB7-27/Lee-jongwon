import './assets/main.css';

import { createApp } from 'vue';
//createApp
//Vue 어플리케이션을 생성하는 함수
//인자로 ROot Component 최상위 컴포넌트를 전달
import App from './App.vue';

//mount : 생성도니 Vue 앱을 HTML문서의 특정 요소에 연결하는 메서드
createApp(App).mount('#app');
