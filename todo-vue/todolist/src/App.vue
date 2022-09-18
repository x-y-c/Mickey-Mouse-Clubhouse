<script setup>
// This starter template is using Vue 3 <script setup> SFCs
// Check out https://vuejs.org/api/sfc-script-setup.html#script-setup
import HelloWorld from './components/HelloWorld.vue'
</script>

<template>

    <n-space vertical>
      <n-card title="小卡片" size="small">
        卡片内容
      </n-card>
      <n-card title="中卡片" size="medium">
        卡片内容
      </n-card>
      <n-card title="大卡片" size="large">
        卡片内容
      </n-card>
      <n-card title="超大卡片" size="huge">
        卡片内容
      </n-card>
    </n-space>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
