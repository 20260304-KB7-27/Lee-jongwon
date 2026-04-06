<template>
  <button @click="increment">좋아요 누르기</button>
</template>

<script setup>
// import { useLikeStore } from '@/stores/like';
import { useLikePersistStore } from '@/stores/persist/persist_like';

const like = useLikePersistStore(); // 객체 자체를 꺼내서 쓰는 방식
const { increment } = useLikePersistStore();
</script>

<style scoped></style>
