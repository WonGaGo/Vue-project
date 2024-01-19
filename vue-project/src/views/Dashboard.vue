<template>
    <div>
        <h1>Dashboard</h1>
        <p>Welcome to the dashboard!</p>
        <div class="form-table">
            <table-component :info="info"></table-component>
        </div>
    </div>
  </template>
  
  <script>
  import TableComponent from '@/components/TableComponent.vue';
  
  export default {
    data() {
      return {
        info: [
        { ISBN: "9789573320838", Name: "少年Pi的奇幻漂流", Author: "楊.馬泰爾(Yann Martal)著; 趙丕慧譯", Introduction: "", status: "1" },
        { ISBN: "9789573317241", Name: "哈利波特神秘的魔法石", Author: "J. K. 羅琳(J. K. Rowling)著; 彭倩文譯", Introduction: "", status: "1" },
        { ISBN: "9789573317586", Name: "哈利波特: 消失的密室", Author: "J. K. 羅琳(J. K. Rowling)著; 彭倩文譯", Introduction: "", status: "3" },
        { ISBN: "9789573318002", Name: "哈利波特: 阿茲卡班的逃犯", Author: "J. K. Rowling作; 彭倩文譯", Introduction: "", status: "2" },
        { ISBN: "9789573318316", Name: "哈利波特: 火盃的考驗", Author: "J. K. 羅琳(J. K. Rowling)著; 彭倩文譯", Introduction: "", status: "2" },
        ]
      };
    },
    components: {
      TableComponent
    }
  };
  </script>