<template>
  <div>
    X : <input type="text" v-model.number="state.x" /><br />
    Y : <input type="text" v-model.number="state.y" /><br />
  </div>
  <div>결과 : {{ result }}</div>
</template>

<script>
import { ref, reactive, computed } from 'vue';

export default {
  name: 'Calc4',

  setup() {
    // 객체를 반응형으로 변환
    const state = reactive({ x: 10, y: 10 });

    // computed : 의존하는 반응형 데이터가 변경될때만 자동으로 재계산
    // -> 결과가 캐싱
    // 읽기전용
    const result = computed(() => {
      return state.x + state.y; //결과값이 바뀌었을때
    });

    return {
      state,
      result,
    };
  },
};
</script>

<style scoped></style>
