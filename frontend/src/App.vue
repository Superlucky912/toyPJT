<template id="app">
  <div class="page">
    <SideNav />
    <MainPage />
  </div>
</template>

<script>
import MainPage from "./components/mainPage.vue";
import SideNav from "./components/theSideNav.vue";

export default {
  name: "App",
  components: {
    MainPage,
    SideNav,
  },
};
</script>

<style>
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #3080cf;
} */
</style>
