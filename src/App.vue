<template>

<main>
  <BookTable />
</main>


<!--       <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav> -->

  <!-- <RouterView /> -->
</template>

<script>
import BookTable from './components/BookTable.vue';

export default{
  components: {
    BookTable
  }
}
</script>

<style scoped>

</style>
