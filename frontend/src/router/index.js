import { createRouter, createWebHistory } from "vue-router";
// import MainPage from "@/views/MainPage.vue";
import Income from "@/views/Income.vue";
import Expenses from "@/views/expenses.vue";

const routes = [
  // { path: "/", name: "MainPage", component: MainPage },
  { path: "/income", name: "Income", component: Income },
  { path: "/expenses", name: "Expenses", component: Expenses },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
