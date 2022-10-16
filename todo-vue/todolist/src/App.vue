<script setup>
</script>

<template>
  <n-gradient-text type="success" size="60px">
    todolist
  </n-gradient-text>
  <n-input v-model:value="value" type="text" placeholder="新的todo" />
  <Drag></Drag>

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
