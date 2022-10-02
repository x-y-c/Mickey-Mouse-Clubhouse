import Vue from 'vue'
import Vuex from 'vuex'
import todo from "../components/todo.vue";

Vue.use(Vuex)
const STORAGE_KEY = "todo-key"
const state = {
    todos: JSON.parse(window.localStorage.getItem(STORAGE_KEY) || '[]')
}

const mutations = {
    addTodo(state, todo) {
        state.todos.push(todo)
    },
    removeTodo(state, todo) {
        state.todos.splice(state.todos.indexOf(todo), 1)
    },
    editTodo(state, {todo, text = todo.text, done = todo.done}) {
        todo.text = text
        todo.done = done
    }
}
const actions = {
    addTodo({commit}, todo) {
        commit('addTodo', {
            uid: Date.now(),
            text,
            done: false
        })
    },
    removeTodo({commit}, todo) {
        commit('removeTodo', todo)
    },
    changeStatus({commit}, todo) {
        commit('editTodo', {todo, done: !todo.done})
    },
    clearCompleted({state, commit}) {
        state.todos.filter(todo => todo.done).forEach(todo => {
            commit('removeTodo', todo)
        })
    }
}

const plugins = [store => {
    store.subscribe((mutation, {todos}) => {
        window.localStorage.setItem(STORAGE_KEY, JSON.stringify(todos))
    })
}]

export  default  new Vuex.Store({
    state,
    mutations,
    actions,
    plugins
})


