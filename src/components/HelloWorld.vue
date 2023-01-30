<template>
  <div class="d-flex" id="wrapper">
    <!-- 네비게이션 -->
    <div class="border bg-white" id="sidebar-wrapper">
        <div class="list-group list-group-flush">
            <a class="list-group-item list-group-item-action list-group-item-light p-3 active" href="#!">월별 입금내역</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">지출내역</a>
        </div>
    </div>
    <div id="page-content-wrapper">
        <!-- Top navigation-->
        <div class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
            <div class="container-fluid">
                <h1 class="text-center text-secondary">2023년</h1>
            </div>
        </div>
        <!-- Page content-->
          <div class="table-responsive d-inline-block w-100 m-3">
            <table class="table table-bordered table-sm">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col" v-for="m in month" v-bind:key="m">{{ m }}</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                  <td >Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                  <td >Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                  <td >Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>@fat</td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td colspan="2">Larry the Bird</td>
                  <td>@twitter</td>
                </tr>
              </tbody>
            </table>
          </div>
          <div>
            <button type="button" class="m-3">클릭</button>
          </div>
    </div>
    <!--  -->
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',

  data : function(){
    return {
      month : []
    }
  },

  created() {
    for(var i = 1; i < 13; i++) {
      this.month.push(i + "월");
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
