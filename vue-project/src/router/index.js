import { createRouter, createWebHistory } from 'vue-router'
import Dashboard from '../views/Dashboard.vue';
import Login from '../views/Login.vue';
import Loginpage from '../components/Login.vue';
import Register from '../components/Register.vue';
const routes = [
  { path: '/', component: Login },
  { path: '/register', name: 'register', component: Register},
  { path: '/dashboard', component: Dashboard, meta: { requiresAuth: true } },
  { path: '/login', name: 'login', component: Login }, 
  { path: '/loginpage', name: 'loginpage', component: Loginpage},
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
/*
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/login',
      name: 'login',
      component: Login
    }
  ]
})

export default router
*/