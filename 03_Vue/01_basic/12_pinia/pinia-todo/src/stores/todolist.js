import { reactive, computed } from 'vue';
import { defineStore } from 'pinia';

export const useTodoListStore = defineStore('todoList', () => {
  // 스토어 ID는 유지해도 됨
  const state = reactive({
    todoList: [
      // 소문자로 통일
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI 학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  });

  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };

  const deleteTodo = (id) => {
    let index = state.todoList.findIndex((item) => item.id === id);
    if (index !== -1) state.todoList.splice(index, 1);
  };

  const toggleDone = (id) => {
    let index = state.todoList.findIndex((item) => item.id === id);
    if (index !== -1) {
      state.todoList[index].done = !state.todoList[index].done;
    }
  };

  const doneCount = computed(() => {
    return state.todoList.filter((item) => item.done === true).length;
  });

  // 변수명도 소문자로 통일
  const todoList = computed(() => state.todolist);

  // 리턴값도 소문자로 통일
  return {
    todoList,
    doneCount,
    addTodo,
    deleteTodo,
    toggleDone,
  };
});
