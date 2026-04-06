import {
  createRouter,
  createWebHistory,
  createWebHashHistory,
} from 'vue-router';
import Home from '@/pages/Home.vue';
import MembersLayout from '@/pages/nested/MembersLayout.vue';

/*
네비게이션 가드 (beforeEnter)
- false를 반환하게 되면 접근을 차단함
*/
const membersIdGuard = (to, from) => {
  // /members 인 경우 /members/:id 에서만 /members/:id로 접근 가능
  if (from.name !== 'members' && from.name !== 'members/id') {
    return false;
  }
};

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  // history: createWebHashHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: Home,
    },
    {
      path: '/members',
      name: 'members',
      //지연로딩 : 해당 경로에 처음 접근할때 컴포넌트를 불러옴
      //초기로딩 속도 개선
      component: () => import('@/pages/MemberLIst.vue'),
    },
    {
      path: '/members/:id',
      name: 'members/id',
      component: () => import('@/pages/MemberInfo.vue'),
      //members에서만 접근해야 상세정보를 볼 수 있게 설정
      beforeEnter: membersIdGuard,
    },
    /* 
    중첩 라우팅
    - 부모 컴포넌트안에 <RouterView>를 두고 children 배열로 자식 라우트를 정의
    - 자식 컴포넌트는 부모의 <ROuterView> 위치에 랜더링
    */
    {
      path: '/members-nested',
      component: () => import('@/pages/nested/MembersLayout.vue'),
      children: [
        {
          //기본값 /members-nested
          path: '',
          name: 'members-nested',
          component: () => import('@/pages/nested/MemberDefault.vue'),
        },
        {
          // /members-nested/:id
          path: ':id',
          name: 'members-nested/detail',
          component: () => import('@/pages/nested/MemberDetail.vue'),
        },
      ],
    },
  ],
});

export default router;
