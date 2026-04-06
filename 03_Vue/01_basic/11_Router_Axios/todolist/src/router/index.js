import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: () => import('@/views/Home.vue') },
    { path: '/about', component: () => import('@/views/About.vue') },
    { path: '/todos', component: () => import('@/views/TodoList.vue') },
    { path: '/todos/add', component: () => import('@/views/AddTodo.vue') },
    {
      path: '/todos/edit/:id',
      component: () => import('@/views/EditTodo.vue'),
    },
    {
      path: '/students',
      component: () => import('@/views/Students.vue'),
    },

    // (.*)*/ : 하위에 모든 문자열을 포함하게 되는 구조
    { path: '/:path(.*)*', component: () => import('@/views/Notfound.vue') },
  ],
});

export default router;
