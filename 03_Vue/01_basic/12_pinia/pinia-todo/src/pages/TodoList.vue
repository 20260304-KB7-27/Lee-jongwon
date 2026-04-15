<template>
  <!-- todo 추가 버튼 -->
  <div class="row">
    <div class="col p-3">
      <RouterLink class="btn btn-primary" to="/todos/add">
        할일 추가
      </RouterLink>
      <span>완료된 할일 : {{ doneCount }}</span>
    </div>
  </div>
  <!-- 목록보여주기 -->
  <div class="row">
    <div class="col p-3">
      <ul class="list-group">
        <TodoItem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
        />
      </ul>
    </div>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useTodoListStore } from '@/stores/todolist.js';
import TodoItem from '@/components/TodoItem.vue';
const todoListStore = useTodoListStore();
const doneCount = computed(() => todoListStore.doneCount);
const todoList = computed(() => todoListStore.todoList);
</script>

<style scoped></style>
