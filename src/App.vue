<template>
  <div class="header">
    <img src="src/Images/f2.png" alt="Kathai" />
  </div>
  <div class="transbox">
    <div class="topnav">
      <a href="#">Link</a>
      <a href="#">Link</a>
      <a href="#">Link</a>
    </div>

    <div class="row">

      <div class="main">
        <router-view />
      </div>
    </div>

    <div class="footer">
      <h2>Footer</h2>
    </div>
  </div>
</template>


<script>

export default {
  name: 'app',
  components: {


  }
}
</script>

<style scoped></style>
