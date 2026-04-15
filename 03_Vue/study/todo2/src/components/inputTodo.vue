<template>
  <input
    type="text"
    class="form-control"
    placeholder="할일 입력"
    v-model.trim="todo"
    @keyup.enter="addTodo"
  />
  <span @click="addTodo">추가</span>
</template>

<script setup>
import { ref } from 'vue';

const todo = ref('');

const emit = defineEmits(['add']);

const addTodo = (e) => {
  if (todo.value === '') return;

  emit('add', {
    id: new Date().getTime(),
    todo: todo.value,

    completed: e.ctrlKey ? true : false,
  });

  todo.value = '';
};
</script>

<style scoped></style>
