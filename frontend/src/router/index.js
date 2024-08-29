import { createRouter, createWebHistory } from "vue-router";
import MainPage from "@/views/MainPage.vue";
import Income from "@/views/Income.vue";

const routes = [
  { path: "/", name: "MainPage", component: MainPage },
  { path: "/income", name: "Income", component: Income },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
