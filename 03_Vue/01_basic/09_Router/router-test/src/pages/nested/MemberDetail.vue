<template>
  <div v-if="member">
    <img :src="member.photo" alt="" />
    <h2>{{ member.name }}</h2>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
import { computed } from 'vue';
import members from '@/members.json';

const route = useRoute();

const member = computed(() =>
  members.find((m) => m.id === Number(route.params.id)),
);
</script>

<style scoped></style>
