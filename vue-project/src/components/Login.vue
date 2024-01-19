<template>
    <div>
        <div class="form-signin">
            <div class="form-title">
                <span>Title</span>
                <img class="" src="@/components/icons/book_tate.png" alt="" width="72" height="57">
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
            <button @click="checkPassword" class="btn btn-primary" type="submit">
                <span>Sign in</span>
            </button>
        </div>
    </div>
</template>
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
            },
            checkPassword() {
                this.$router.push('/dashboard');
            }
        }
    }
</script>