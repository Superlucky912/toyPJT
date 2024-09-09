<template id="app">
  <div class="page">
    <SideNav v-if="!isLoginPage" />
    <router-view></router-view>
  </div>
</template>

<script>
import { computed } from "vue";
import { useRoute } from "vue-router";
import SideNav from "@/components/theSideNav.vue";

export default {
  name: "App",
  components: {
    // MainPage,
    SideNav,
  },
  setup() {
    const route = useRoute();

    const isLoginPage = computed(() => route.path === "/login");

    return {
      isLoginPage,
    };
  },
};
</script>
