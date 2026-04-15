import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: () => import('@/pages/Home.vue') },
    { path: '/about', component: () => import('@/pages/About.vue') },
    { path: '/todos', component: () => import('@/pages/TodoList.vue') },
    { path: '/todos/add', component: () => import('@/pages/AddTodo.vue') },
    {
      path: '/todos/edit/:id',
      component: () => import('@/pages/EditTodo.vue'),
    },
    // {
    //   path: '/students',
    //   component: () => import('@/pages/Students.vue'),
    // },

    // (.*)*/  : 하위에 모든 문자열을 포함하게되는 정규식
    // { path: '/:paths(.*)*', component: () => import('@/pages/NotFound.vue') },
  ],
});

export default router;
