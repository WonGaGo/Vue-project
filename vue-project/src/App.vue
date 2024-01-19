<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
</script>

<template>
  <div id="app">
    <!-- 一些全局的結構，例如頁首、頁尾等 -->

    <!-- 路由出口 -->
    <router-view></router-view>
  </div>
</template>