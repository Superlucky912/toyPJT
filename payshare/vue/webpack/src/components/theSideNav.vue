<template>
  <aside class="navbar navbar-vertical navbar-expand-lg" data-bs-theme="dark">
    <div class="container-fluid">
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#sidebar-menu"
        aria-controls="sidebar-menu"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <!-- 상단 로고 -->
      <h1 class="navbar-brand navbar-brand-autodark">
        <router-link to="/">
          <PigIcon />
          PayShare
        </router-link>
      </h1>
      <!-- navigation start-->
      <div class="card">
        <div class="card-header">
          <h2 class="card-title">현재 잔액</h2>
        </div>
        <div class="card-body">
          <!-- <WonIcon /> -->
          <h2 style="display: inline-block">1,600,000</h2>
        </div>
      </div>
      <div class="collapse navbar-collapse" id="sidebar-menu">
        <ul class="navbar-nav pt-lg-3">
          <!-- mainPage -->
          <!-- <li class="nav-item">
            <router-link class="nav-link" to="/">
              <HomeIcon />
              <span class="nav-link-title"> MainPage </span>
            </router-link>
          </li> -->
          <!-- 회비입금 -->
          <li class="nav-item">
            <router-link class="nav-link" to="/income">
              <CoinIcon />
              <span class="nav-link-title"> 회비입금 </span>
            </router-link>
          </li>
          <!-- 지출내역 -->
          <li class="nav-item">
            <router-link class="nav-link" to="/expenses">
              <WonIcon />
              <span class="nav-link-title"> 지출내역 </span>
            </router-link>
          </li>
        </ul>
      </div>
    </div>
  </aside>
</template>

<script>
import HomeIcon from "@/assets/icon/homeIcon.vue";
import CoinIcon from "@/assets/icon/coinIcon.vue";
import WonIcon from "@/assets/icon/wonIcon.vue";
import PigIcon from "@/assets/icon/pigIcon.vue";

export default {
  name: "theSideNav",

  components: {
    HomeIcon,
    CoinIcon,
    WonIcon,
    PigIcon,
  },

  data: function () {
    return {
      msg: "hello world",
    };
  },
};
</script>
<style lang="css" scoped>
@media (max-width: 667px) {
  /*20240903 핸드폰 화면 css 수정*/
  .card {
    border: none;
    float: right;
  }
  .card-header {
    display: inline-block;
    text-align: center;
    padding: 0 1rem;
  }
  .card-body {
    display: inline-block;
    text-align: center;
    padding: 0 1rem;
  }
  /* 수정 끝*/
}

@media (min-width: 667px) and (max-width: 992px) {
  /*20240903 축소 시 현재 잔액 css 수정*/
  .card {
    display: inline-block;
  }
  .card-header {
    display: inline-block;
  }
  .card-body {
    display: inline-block;
  }
  /* 수정 끝*/
}
</style>
