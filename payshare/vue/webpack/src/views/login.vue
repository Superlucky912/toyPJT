<template>
  <div class="page page-center">
    <div class="container-tight py-4">
      <form class="card card-md" @submit.prevent="handleLogin">
        <div class="card-body">
          <h2 class="card-title text-center mb-4">로그인</h2>
          <div class="mb-3">
            <label v-if="!idError" class="form-label">아이디</label>
            <label v-else class="text-danger mb-2">아이디가 잘못되었습니다.</label>
            <input v-model="userId" type="text" class="form-control" placeholder="아이디를 입력하세요" :class="{ 'is-invalid': idError }" required />
          </div>
          <div class="mb-2">
            <label v-if="!pwError" class="form-label">비밀번호</label>
            <label v-else class="text-danger mb-2">비밀번호가 잘못되었습니다.</label>
            <input
              v-model="password"
              type="password"
              class="form-control"
              placeholder="비밀번호를 입력하세요"
              :class="{ 'is-invalid': pwError }"
              required
            />
          </div>

          <div class="form-footer">
            <button type="submit" class="btn btn-primary w-100">로그인</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
import axios from "axios";
import { ref } from "vue";
import { useRouter } from "vue-router";


export default {
  name: "Login",
  setup() {
    const userId = ref("");
    const password = ref("");
    const idError = ref(false);
    const pwError = ref(false);
    const router = useRouter();

    // 페이지 로드 시 로그인 여부 확인
    if (localStorage.getItem("isLoggedIn") === "true") {
      router.push("/income");
    }

    const handleLogin = async () => {
      const params = new URLSearchParams();
      params.append("id", userId.value);
      params.append("pw", password.value);

      try {
        const response = await axios.post(
          "http://localhost:8080/api/login",
          params,
          {
            withCredentials: true, // 세션 기반 로그인 시 꼭 필요!
            headers: {
              "Content-Type": "application/x-www-form-urlencoded",
              },
          }
          
        );

        // 로그인 성공 처리
        localStorage.setItem("isLoggedIn", "true");
        localStorage.setItem("userId", userId.value);
        router.push("/income");
      } catch (error) {
        // 로그인 실패 처리
        console.error("로그인 실패", error);
        if (error.response && error.response.status === 401) {
          idError.value = false;
          pwError.value = true;
        } else {
          idError.value = true;
          pwError.value = false;
        }
      }
    };

    return {
      userId,
      password,
      idError,
      pwError,
      handleLogin,
    };
  },
};
</script>
