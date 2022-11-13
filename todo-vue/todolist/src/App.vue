<script setup>
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
      <div v-if="pending.length > 0">
        <p class="status busy">you have {{ pending.length }} pending item <span v-if="pending.length>1">s</span>  </p>
//todo <transition-group></transition-group>

      </div>

    </div>
  </div>
</template>

<style scoped>
</style>
