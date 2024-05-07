<template>
  <div class="page-wrapper">
    <!-- 년도 달력 -->
    <div class="navbar-expand-lg navbar-light bg-light border-bottom p-1">
      <!-- <div class="container-fluid"> -->
      <h1 class="text-center text-secondary">{{ year }}년</h1>
      <!-- </div> -->
    </div>
    <!-- 월 테이블 -->
    <div class="table-responsive w-100 m-3">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th scope="col" style="width: 25px">이름</th>
            <th scope="col" v-for="m in month" v-bind:key="m">{{ m }}</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="member in members" v-bind:key="member">
            <th>
              <span class="memName">{{ member }}</span>
            </th>
            <td v-for="m in month" v-bind:key="m">
              <input type="text" v-id="'G_' + m" class="fw-bold text-center" style="width: 80px" />
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <div>
      <button type="button" class="m-3">클릭</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "indexPage",

  data: function () {
    return {
      month: [],
      year: null,
      members: ["고성빈", "오태건", "유종훈", "임채민", "정성희"],
    };
  },

  created() {
    // 년계산
    this.year = new Date().getFullYear();

    // 월계산
    for (var i = 1; i < 13; i++) {
      this.month.push(i + "월");
    }
  },

  mounted() {},
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.memName {
  display: block;
  width: 60px;
  margin-top: 3px;
}
</style>
