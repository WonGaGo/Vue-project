<template>
    <table class="table">
      <thead>
        <tr>
          <th scope="col">ISBN</th>
          <th scope="col">Name</th>
          <th scope="col">Author</th>
          <th scope="col">Introduction</th>
          <th scope="col">status</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="name in info" :key="name.ISBN">
          <td>{{ name.ISBN }}</td>
          <td>{{ name.Name }}</td>
          <td>{{ name.Author }}</td>
          <td>{{ name.Introduction }}</td>
          <td>{{ name.status }}</td>
        </tr>
      </tbody>
    </table>
  </template>
  
  <script>
  export default {
    props: {
      info: {
        type: Array,
        required: true
      }
    }
  };
  </script>