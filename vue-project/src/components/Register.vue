<template>
    <div>
        <div class="form-signin">
            <div class="form-title">
                <span>Register</span>
                <img class="" src="@/components/icons/book_tate.png" alt="" width="72" height="57">
            </div>
            <div class="form-label">
                <label for="inputId" class="label-text">User ID (*)</label>
                <input type="" id="inputId" class="form-control" placeholder="User ID">
            </div>
            <div class="form-label">
                <label for="inputPhone" class="label-text">Phone number (*)</label>
                <input type="" id="inputPhone" class="form-control" placeholder="Phone number">
            </div>
            <div class="form-label">
                <label for="inputPassword" class="label-text">Password (*)</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password">
            </div>
            <div class="form-label">
                <button @click="Register" class="btn btn-primary" type="submit">
                    <span>Register</span>
                </button>
            </div>
            <div class="form-label">
                <button @click="Back" class="btn btn-second" type="submit">
                    <span>Back</span>
                </button>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        methods: {
            logout() {
                localStorage.removeItem('userName');
                localStorage.removeItem('token');
                this.$router.go(0)
            },
            Register() {
                this.$router.push('/Loginpage');
            },
            Back() {
                this.$router.push('/Loginpage');
            }
        }
    }
</script>