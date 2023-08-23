<template>
<table>
            <tr>
              <th>Id</th>
              <th>Book</th>
              <th>Author</th>
            </tr>
            <tr th:each="book : ${books}">
                <td th:text="${book.id}"></td>
                <td th:text="${book.title}"></td>
                <td th:text="${book.author}"></td>
            </tr>
          </table>
</template>

<script>

</script>

<style scoped>

</style>