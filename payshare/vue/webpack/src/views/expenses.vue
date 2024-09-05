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
                <h1 style="display: inline-block">2024년</h1>
                <div style="float: right">
                  <button type="button" class="btn btn-green" style="margin-right: 5px" @click="createExpense">추가</button>
                  <button type="button" class="btn btn-yellow" style="margin-right: 5px" @click="modifyMode = false">수정</button>
                  <button type="button" class="btn btn-red" style="margin-right: 5px" @click="deleteExpense">삭제</button>
                </div>
              </div>
              <div class="list-group list-group-flush list-group-hoverable">
                <div class="list-group-item">
                  <div class="m-1">
                    <div class="text-secondary text-truncate mt-n1">2024-09-05</div>
                    <div class="row align-items-center">
                      <div class="col text-truncate">
                        <h3 class="text-reset" style="display: inline-block; vertical-align: -webkit-baseline-middle">서브웨이</h3>
                        <h1 style="float: right">-1,000,000 원</h1>
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

    const createExpense = () => {
      console.log("추가");
    };

    const deleteExpense = () => {
      console.log("삭제");
    };

    return {
      year,
      month,
      createExpense,
      deleteExpense,
    };
  },
};
</script>
