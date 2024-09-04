<template id="app">
  <div class="page">
    <SideNav />
    <router-view></router-view>
  </div>
</template>

<script>
import SideNav from "@/components/theSideNav.vue";

export default {
  name: "App",
  components: {
    // MainPage,
    SideNav,
  },
};
</script>
