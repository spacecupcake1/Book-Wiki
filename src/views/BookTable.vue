<template>
<table>
            <tr>
              <th>Id</th>
              <th>Book</th>
              <th>Author</th>
            </tr>
            <tr v-for="book in books" :key="book.Book_Id">
      <td>{{ book.Book_Id }}</td>
      <td>{{ book.Title }}</td>
      <td>{{ book.Authors }}</td>
    </tr>
  </table>
</template>

<script>
import axios from 'axios';

export default {
  name: 'BookTable',
  data() {
    return {
      books: []
    };
  },
  mounted() {
    axios.get('http://localhost:5173/table/../../ajaxfile.php')
      .then(response => {
        this.books = response.data;
      })
      .catch(error => {
        console.error(error);
      });
  }
};
</script>

<style scoped>

table {
  color: #6f0000;
  width: 100%;
}

th,
td {
  border: 1px solid  #fbc4ab;
  padding: 10px;
  text-align: center;
  color: black
}

</style>