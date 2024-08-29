<template>
  <div class="page-wrapper">
    <!-- Page header -->
    <div class="page-header d-print-none">
      <div class="container-xl">
        <div class="row g-2 align-items-center">
          <div class="col">
            <!-- Page pre-title -->
            <div class="page-pretitle">Overview</div>
            <h2 class="page-title">MainPage</h2>
          </div>
        </div>
      </div>
    </div>
    <div class="page-body">
      <div class="container-xl">
        <div class="row row-cards">
          <div class="col-md-6 col-lg-9">
            <div class="card">
              <div class="card-header">
                <h2 class="card-title">현재 잔액</h2>
              </div>
              <div class="card-body">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="24"
                  height="24"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="currentColor"
                  stroke-width="2"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  class="icon icon-tabler icons-tabler-outline icon-tabler-currency-won"
                >
                  <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                  <path d="M4 6l3.245 11.358a.85 .85 0 0 0 1.624 .035l3.131 -9.393l3.131 9.393a.85 .85 0 0 0 1.624 -.035l3.245 -11.358" />
                  <path d="M21 10h-18" />
                  <path d="M21 14h-18" />
                </svg>
                <h2 style="display: inline-block">1,600,000</h2>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4">
            <!-- Cards with tabs component -->
            <div class="card-tabs">
              <!-- Cards navigation -->
              <ul class="nav nav-tabs">
                <li class="nav-item">
                  <a href="#tab-top-1" class="nav-link active" data-bs-toggle="tab">Tab 1</a>
                </li>
                <li class="nav-item">
                  <a href="#tab-top-2" class="nav-link" data-bs-toggle="tab">Tab 2</a>
                </li>
                <li class="nav-item">
                  <a href="#tab-top-3" class="nav-link" data-bs-toggle="tab">Tab 3</a>
                </li>
                <li class="nav-item">
                  <a href="#tab-top-4" class="nav-link" data-bs-toggle="tab">Tab 4</a>
                </li>
              </ul>
              <div class="tab-content">
                <!-- Content of card #1 -->
                <div id="tab-top-1" class="card tab-pane active show">
                  <div class="card-body">
                    <div class="card-title">Content of tab #1</div>
                    <p class="text-muted">
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, alias aliquid distinctio dolorem expedita, fugiat hic magni
                      molestiae molestias odit.
                    </p>
                  </div>
                </div>
                <!-- Content of card #2 -->
                <div id="tab-top-2" class="card tab-pane">
                  <div class="card-body">
                    <div class="card-title">Content of tab #2</div>
                    <p class="text-muted">
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, alias aliquid distinctio dolorem expedita, fugiat hic magni
                      molestiae molestias odit.
                    </p>
                  </div>
                </div>
                <!-- Content of card #3 -->
                <div id="tab-top-3" class="card tab-pane">
                  <div class="card-body">
                    <div class="card-title">Content of tab #3</div>
                    <p class="text-muted">
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, alias aliquid distinctio dolorem expedita, fugiat hic magni
                      molestiae molestias odit.
                    </p>
                  </div>
                </div>
                <!-- Content of card #4 -->
                <div id="tab-top-4" class="card tab-pane">
                  <div class="card-body">
                    <div class="card-title">Content of tab #4</div>
                    <p class="text-muted">
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, alias aliquid distinctio dolorem expedita, fugiat hic magni
                      molestiae molestias odit.
                    </p>
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
export default {
  name: "MainPage",

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
