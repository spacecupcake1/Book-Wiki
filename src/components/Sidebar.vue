<template>
    <aside :class="`${is_expandend && 'is_expandend'}`">
        <div class="logo">
            <img src="../assets/logo.svg" alt="Vue">
        </div>
        Sidebar

        <div class="menu-toggle-wrap">
            <button class="menu-toogle">
                <span class="material-icons">
                    keyboard_double_arrrow
                </span>
            </button>
        </div>
    </aside>

</template>

<script>
import { ref } from 'vue';
export default {
setup(){

const is_expandend = ref(false)

const ToggelMenu = () => {
    is_expandend.value =!is_expandend.value
}
return{ 
    is_expandend,
    ToggelMenu
}
}
}

</script>

<style scoped>
aside {
    display: flex;
    flex-direction: column;
    width: calc(2rem + 32px);
    min-height: 100vh;
    overflow: hidden;
    padding: 1rem;

    background-color: black;
    color: white;

    transition: 0.2s ease-out;
    
}

.logo {
        margin-bottom: 1rem;
    }

img{
        width: 2rem;
    }

 .is-expanded {
    width: var(--sidebar-width);
} 

.menu-toggle-wrap {
    top: -3rem;

    display: flex;
    justify-content: flex-end;
    margin-bottom: 1rem;

    position: relative;
    top:0;
    transition: 0.2s ease-out;
}

.menu-toggle {
    transition: 0.2s ease-out;

    transform: rotate(-180deg);
}

.material-icons {
    font-size: 2rem;
    color: white;
}

</style>