<template>
  <div class="page-wrapper">
    <!-- Page header -->
    <div class="page-header d-print-none">
      <div class="container-xl">
        <div class="row g-2 align-items-center">
          <div class="col">
            <h2 class="page-title">지출내역</h2>
          </div>
        </div>
      </div>
    </div>
    <!-- Page body -->
    <div class="page-body">
      <div class="container-xl">
        <div class="row row-cards">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h1 style="display: inline-block">
                  <span style="margin-right: 10px; cursor: pointer" @click="yearChange(-1)"><</span>
                  {{ year }}년
                  <span style="margin-left: 10px; cursor: pointer" @click="yearChange(1)">></span>
                </h1>
                <div style="float: right">
                  <button type="button" class="btn btn-green" style="margin-right: 5px" @click="createExpense">추가</button>
                  <!-- <button type="button" class="btn btn-yellow" style="margin-right: 5px" @click="modifyMode = false">수정</button>
                  <button type="button" class="btn btn-red" style="margin-right: 5px" @click="deleteExpense">삭제</button> -->
                </div>
              </div>
              <div class="list-group list-group-flush list-group-hoverable">
                <div class="list-group-item">
                  <div class="m-1">
                    <div class="text-secondary text-truncate mt-n1">2024-09-05</div>
                    <div class="row align-items-center">
                      <div class="col text-truncate">
                        <h3 class="text-reset" style="display: inline-block">ㅇㅇ</h3>
                        <h1 style="float: right">-1,000,000 원</h1>
                      </div>
                      <div class="col-auto lh-1" style="margin-bottom: var(--tblr-spacer)">
                        <div class="dropdown">
                          <a href="#" class="link-secondary" data-bs-toggle="dropdown"
                            ><!-- Download SVG icon from http://tabler-icons.io/i/dots -->
                            <svg
                              xmlns="http://www.w3.org/2000/svg"
                              class="icon"
                              width="24"
                              height="24"
                              viewBox="0 0 24 24"
                              stroke-width="2"
                              stroke="currentColor"
                              fill="none"
                              stroke-linecap="round"
                              stroke-linejoin="round"
                            >
                              <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                              <path d="M5 12m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0" />
                              <path d="M12 12m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0" />
                              <path d="M19 12m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0" />
                            </svg>
                          </a>
                          <div class="dropdown-menu dropdown-menu-end">
                            <a class="dropdown-item" href="#" @click="deleteExpense()"> 수정 </a>
                            <a class="dropdown-item" href="#" @click="deleteExpense()"> 삭제 </a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="m-1">
                    <div class="text-secondary text-truncate mt-n1">2024-09-05</div>
                    <div class="row align-items-center">
                      <div class="col text-truncate">
                        <h3 class="text-reset" style="display: inline-block; vertical-align: -webkit-baseline-middle">맥도날드</h3>
                        <h1 style="display: inline-block; float: right">-1,000,000 원</h1>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { ref } from "vue";

export default {
  name: "Income",

  setup() {
    const year = ref(null);
    const month = ref([]);

    // 년계산
    year.value = new Date().getFullYear();

    // 년 변경
    const yearChange = (value) => {
      let nextYear = year.value + value;
      if (nextYear > 2022 && nextYear <= new Date().getFullYear()) {
        year.value = nextYear;
      }
    };

    const createExpense = () => {
      console.log("추가");
    };

    const deleteExpense = () => {
      console.log("삭제");
    };

    return {
      year,
      yearChange,
      month,
      createExpense,
      deleteExpense,
    };
  },
};
</script>

<style scoped>
.card-header {
  display: inline-block;
}
</style>
