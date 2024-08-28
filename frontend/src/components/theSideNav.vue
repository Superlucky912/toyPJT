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
        <a href=".">
          <PigIcon />
          BANK MANAGER
        </a>
      </h1>
      <!-- navigation start-->
      <div class="collapse navbar-collapse" id="sidebar-menu">
        <ul class="navbar-nav pt-lg-3">
          <!-- mainPage -->
          <li class="nav-item">
            <a class="nav-link" href="./">
              <HomeIcon />
              <span class="nav-link-title"> MainPage </span>
            </a>
          </li>
          <!-- 회비입금 -->
          <li class="nav-item">
            <a class="nav-link" href="./">
              <CoinIcon />
              <span class="nav-link-title"> 회비입금 </span>
            </a>
          </li>
          <!-- 지출내역 -->
          <li class="nav-item">
            <a class="nav-link" href="./">
              <WonIcon />
              <span class="nav-link-title"> 지출내역 </span>
            </a>
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

<style>
/* .navbar {
  --tblr-navbar-bg: #ffd225;
  --tblr-navbar-border-color: #b15f00;
  --tblr-navbar-color: #b15f00;
  --tblr-navbar-brand-color: #b15f00;
  --tblr-navbar-border-width: 3px;
}
.icon {
  stroke-width: 2.5px;
}

.nav-link-icon {
  color: #b15f00;
}

.nav-link {
  font-weight: 700;
} */
</style>
