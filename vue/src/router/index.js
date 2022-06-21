import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/Login.vue'
import Register from "../views/Users/Register";
import Forgot from "../views/Users/Forgot";
import Home from "../views/Home";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Login',
        component: Login
    },
    {
        path: '/register',
        name: 'Register',
        component: Register
    },
    {
        path: '/forgot',
        name: 'Forgot',
        component: Forgot
    },
    {
        path: '/home',
        name: 'Home',
        component: Home
    }

]

const router = new VueRouter({
    routes
})

export default router
