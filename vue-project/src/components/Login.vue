<template>
    <div>
        <div class="form-signin">
            <div class="form-title">
                <span>Title</span>
                <img class="" src="../icons/book_tate.png" alt="" width="72" height="57">
            </div>
            <div class="form-label">
                <label for="inputPhone" class="label-text">Phone number</label>
                <input type="" id="inputPhone" class="form-control" placeholder="Phone number">
            </div>
            <div class="form-label">
                <label for="inputPassword" class="label-text">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password">
            </div>
            <div class="form-label">
            <label class="label-checkbox">
                <input type="checkbox" value="remember-me">
                <span>Remember me</span>
            </label>
            </div>
            <button class="btn btn-primary" type="submit">
                <span>Sign in</span>
            </button>
        </div>
    </div>
</template>
<style>
    .form-signin {
        width: 100%;
        max-width: 330px;
        padding: 15px;
        margin: auto;
        display: flex;
        flex-direction: column;
        border: 1px;
        color: black;
    }
    .form-title {
        font-size: 40px;
        display: flex;
        justify-content: center;
    }
    .form-label{
        display: flex;
        flex-direction: column;
        padding-bottom: 16px;
    }
    .form-control{
        border-radius: 8px;
        border: 1px solid #818181;
        padding: 0 12px;
        min-height: 38px;
    }
    .label-text{
        font-size: 20px;
    }
    .btn-primary{
        border: 0;
        color: #F3F3F3;
        text-align: center;
        display: inline-block;
        width: auto;
        height: 48px;
        border-radius: 20px;
        background: #111111;
        line-height: 24px;
        cursor: pointer;
    }
    .btn-primary span {
        height: 48px;
        padding: 12px 24px 12px 24px;
        font-size: 20px;
    }
    .label-checkbox{
        display: flex;
        align-items: center;
    }

</style>
<script>
    export default {
        data() {
            return {
                userName:'',
                notLogin:true
            }
        },
        mounted() {
            let userName = localStorage.getItem('userName')
            console.log(userName)
            this.userName = userName ? userName : '未登入'
            this.notLogin = userName ? false : true
        },
        methods: {
            logout() {
                localStorage.removeItem('userName');
                localStorage.removeItem('token');
                this.$router.go(0)
            }
        }
    }
</script>