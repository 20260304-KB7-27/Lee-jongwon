<template>
  <ul>
    <TodoListItem
      v-for="todoitem in todolist"
      :key="todoitem.id"
      :todoitem="todoitem"
      @toggle="toggleCompleted"
      @delete="deleteTodo"
    >
    </TodoListItem>
  </ul>
</template>

<script setup>
import TodoListItem from './TodoListItem.vue';

const props = defineProps({
  todolist: Array, //부모가 보내준거 받기위함
});

const emit = defineEmits(['toggle', 'delete']); //부모에게 보내기 위해 설정

const toggleCompleted = (id) => {
  emit('toggle', id);
};
const deleteTodo = (id) => {
  emit('delete', id);
};
</script>

<style lang="scss" scoped></style>
