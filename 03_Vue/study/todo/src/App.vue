<template>
  <h1>::todoList</h1>

  <InputTodo @add="addTodo"></InputTodo>

  <TodoList
    :todolist="todolist"
    @delete="deleteTodo"
    @toggle="toggleCompleted"
  ></TodoList>
</template>
<script setup>
import TodoList from './components/todoList.vue';
import InputTodo from './components/inputTodo.vue';
import { ref } from 'vue';

let ts = new Date().getTime();

const todolist = ref([
  { id: ts, todo: '자전거 타기', completed: false },
  { id: ts + 1, todo: '딸과 공원 산책', completed: true },
  { id: ts + 2, todo: '일요일 애견 카페', completed: false },
  { id: ts + 3, todo: 'Vue 원고 집필', completed: false },
]);

const addTodo = (newTodo) => {
  todolist.value.push(newTodo);
};

const deleteTodo = (id) => {
  let index = todolist.value.findIndex((item) => id === item.id);
  todolist.value.splice(index, 1);
};

const toggleCompleted = (id) => {
  let index = todolist.value.findIndex((item) => id === item.id);
  todolist.value[index].completed = !todolist.value[index].completed;
};
</script>

<style scoped></style>
