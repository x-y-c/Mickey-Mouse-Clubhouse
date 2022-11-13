<script setup>
import Index from "../index.html";
</script>

<template>
  <div>
    <h1>TODO list</h1>
    <div class="todo-wrapper">
      <h2 class="todo-title">{{today.day}}<br>{{today.date}}</h2>
      <form @keydown.enter.prevent="">
        <input type="text" class="input-todo" v-bind:class="{active: new_todo }" placeholder="qingchu" value="new _todo" v-on:keyup.enter="addItem">
        <div class="btn btn-add" v-bind:class="{ active: new_todo}" @click="addItem">+</div>
      </form>

    </div>
  </div>
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
