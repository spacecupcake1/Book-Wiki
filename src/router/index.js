import About from '../views/About.vue';
import Booktable from '../views/Booktable.vue';
import Home from '../views/Home.vue';

import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            name: 'Home',
            component: Home
        },
        {
            path: '/about',
            name: 'About',
            component: About
        },
        {
            path: '/table',
            name: 'Booktable',
            component: Booktable
        }
    ]
})

export default router