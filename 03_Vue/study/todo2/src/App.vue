<template>
  <div class="container">
    <Header></Header>
    <RouterView> </RouterView>
  </div>
</template>
<script setup>
import axios from 'axios';
import Header from './components/header.vue';
import { reactive, computed, provide, onMounted } from 'vue';

let ts = new Date().getTime();

const BASEURI = '/api/todos';

const states = reactive({
  todoList: [
    { id: 1, todo: 'ES6 학습 ', desc: '설명 1', done: false },
    { id: 2, todo: 'React 학습 ', desc: '설명 2', done: false },
    { id: 3, todo: 'ContextAPI 학습 ', desc: '설명 3', done: true },
    { id: 4, todo: '야구경기 관람 ', desc: '설명 4', done: false },
  ],
});

const addTodo = ({ todo, desc }) => {
  states.todoList.push({ id: new getTime(), todo, desc, done: false });
};

const toggleDone = (id) => {
  let index = states.todoList.findIndex((todo) => todo.id === id);
  states.todoList[index].done = states.todoList[index].done;
};

pro;
</script>

<style scoped></style>
