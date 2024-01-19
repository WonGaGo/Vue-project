<template>
    <div>
    <!-- 這裡可以使用獲取的數據 -->
    {{ user.phone }}
    {{ user.password }}
    
    <!-- 其他組件內容 -->

    <button @click="submit">Submit</button>
  </div>
  </template>
  
  <script>
    import axios from 'axios';

export default {
  data() {
    return {
      user: {
        phone: '',
        password: ''
      }
    };
  },
  methods: {
    getData() {
      const baseUrl = '/api/MySpringBoot/student/allstudent';

      axios.get(baseUrl)
        .then(response => {
          // 在這裡處理請求成功的回應
          console.log('網絡請求成功', response.data);
          // 更新組件的數據
          if (this.phone === 'example' && this.password === 'password') {
            // 登入成功，導向到 Dashboard 頁面
            this.$router.push('/dashboard');
          }else {
            // 登入失敗，可以顯示錯誤提示或其他處理
            this.$router.push('/loginpage');
            console.error('登入失敗');
          }
          //this.user.phone = response.data.phone;
          //this.user.password = response.data.password;
        })
        .catch(error => {
          // 在這裡處理請求失敗的情況
          console.error('網絡請求失敗', error);
        });
    }
  },
  created() {
    this.getData();
  }
};
  </script>