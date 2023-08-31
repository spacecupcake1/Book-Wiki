<template>
  <div class="header">
    <img src="src/Images/f2.png" alt="Kathai" />
    <div class="Menu">
      <sidebar />
    </div>
  </div>
  <div class="transbox">
    <div class="topnav">
      <a href="#">Link</a>
      <a href="#">Link</a>
      <a href="#">Link</a>
    </div>

    <div class="row">
      <div class="menu">
        <h2>Column</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis
          velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus
          leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>
      </div>

      <div class="main">
        <h2>Column</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis
          velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus
          leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>
      </div>

      <div class="column">
        <h2>Column</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis
          velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus
          leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>
      </div>
    </div>

    <div class="footer">
      <h2>Footer</h2>
    </div>
  </div>
</template>


<script>
import Sidebar from './components/Sidebar.vue';

export default {
  name: 'app',
  components: {
    Sidebar
  }
}
</script>

<style scoped></style>
