<template id="app">
  <div class="page">
    <sideNav />
    <mainPage />
  </div>
</template>

<script>
import mainPage from "./components/mainPage.vue";
import sideNav from "./components/theSideNav.vue";

export default {
  name: "App",
  components: {
    mainPage,
    sideNav,
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
