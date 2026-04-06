import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useCounterPersistStore = defineStore(
  'counter-persist',
  () => {
    const count = ref(0);

    function increment() {
      count.value++;
    }

    function reset() {
      count.value = 0;
    }

    return { count, increment, reset };
  },
  {
    persist: true, //localStorage에 자동저장/복원
  },
);
