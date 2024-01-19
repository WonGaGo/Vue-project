import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue';
import Dashboard from '../views/Dashboard.vue';
import Login from '../views/Login.vue';
import Loginpage from '../components/Login.vue';
const routes = [
  { path: '/', component: Home },
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