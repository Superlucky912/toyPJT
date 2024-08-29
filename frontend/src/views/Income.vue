<template>
  <div class="page-wrapper">
    <!-- 년도 달력 -->
    <div class="navbar-expand-lg navbar-light bg-light border-bottom p-1">
      <h1 class="text-center text-secondary">{{ year }}년</h1>
    </div>
    <!-- 월 테이블 -->
    <div class="table-responsive m-3">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th scope="col" style="width: 25px">이름</th>
            <th scope="col" v-for="m in month" :key="m">{{ m }}</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="member in members" :key="member.id">
            <th>
              <span class="memName">{{ member.name }}</span>
            </th>
            <td v-for="m in month" :key="m">
              <div class="checkbox-wrapper-10">
                <input class="tgl tgl-flip" :id="'G_' + member.id + '_' + m" type="checkbox" checked v-model="checkedValues[member.id][m]" />
                <label class="tgl-btn" data-tg-off="미입금" data-tg-on="입금완료" :for="'G_' + member.id + '_' + m"></label>
              </div>
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
import { ref } from "vue";

export default {
  name: "Income",

  setup() {
    const year = ref(null);
    const month = ref([]);

    // 멤버 배열에 id와 name을 포함시킵니다
    const members = ref([
      { id: 1, name: "고성빈" },
      { id: 2, name: "오태건" },
      { id: 3, name: "유종훈" },
      { id: 4, name: "임채민" },
      { id: 5, name: "정성희" },
    ]);

    // 체크박스 상태를 멤버 ID와 월을 기준으로 관리합니다
    const checkedValues = ref({});

    // 년계산
    year.value = new Date().getFullYear();

    // 월계산 및 체크박스 상태 초기화
    for (let i = 1; i < 13; i++) {
      month.value.push(i + "월");
    }

    // 체크박스 상태 초기화
    members.value.forEach((member) => {
      checkedValues.value[member.id] = {};
      month.value.forEach((m) => {
        checkedValues.value[member.id][m] = false; // 초기값 설정
      });
    });

    return {
      year,
      month,
      members,
      checkedValues,
    };
  },
};
</script>

<style scoped>
.memName {
  display: block;
  width: 60px;
  margin-top: 3px;
}
.checkbox-wrapper-10 .tgl {
  display: none;
}
.checkbox-wrapper-10 .tgl,
.checkbox-wrapper-10 .tgl:after,
.checkbox-wrapper-10 .tgl:before,
.checkbox-wrapper-10 .tgl *,
.checkbox-wrapper-10 .tgl *:after,
.checkbox-wrapper-10 .tgl *:before,
.checkbox-wrapper-10 .tgl + .tgl-btn {
  box-sizing: border-box;
}
.checkbox-wrapper-10 .tgl::-moz-selection,
.checkbox-wrapper-10 .tgl:after::-moz-selection,
.checkbox-wrapper-10 .tgl:before::-moz-selection,
.checkbox-wrapper-10 .tgl *::-moz-selection,
.checkbox-wrapper-10 .tgl *:after::-moz-selection,
.checkbox-wrapper-10 .tgl *:before::-moz-selection,
.checkbox-wrapper-10 .tgl + .tgl-btn::-moz-selection,
.checkbox-wrapper-10 .tgl::selection,
.checkbox-wrapper-10 .tgl:after::selection,
.checkbox-wrapper-10 .tgl:before::selection,
.checkbox-wrapper-10 .tgl *::selection,
.checkbox-wrapper-10 .tgl *:after::selection,
.checkbox-wrapper-10 .tgl *:before::selection,
.checkbox-wrapper-10 .tgl + .tgl-btn::selection {
  background: none;
}
.checkbox-wrapper-10 .tgl + .tgl-btn {
  outline: 0;
  display: block;
  width: 4em;
  height: 2em;
  position: relative;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
.checkbox-wrapper-10 .tgl + .tgl-btn:after,
.checkbox-wrapper-10 .tgl + .tgl-btn:before {
  position: relative;
  display: block;
  content: "";
  width: 50%;
  height: 100%;
}
.checkbox-wrapper-10 .tgl + .tgl-btn:after {
  left: 0;
}
.checkbox-wrapper-10 .tgl + .tgl-btn:before {
  display: none;
}
.checkbox-wrapper-10 .tgl:checked + .tgl-btn:after {
  left: 50%;
}

.checkbox-wrapper-10 .tgl-flip + .tgl-btn {
  padding: 2px;
  transition: all 0.2s ease;
  font-family: sans-serif;
  perspective: 100px;
}
.checkbox-wrapper-10 .tgl-flip + .tgl-btn:after,
.checkbox-wrapper-10 .tgl-flip + .tgl-btn:before {
  display: inline-block;
  transition: all 0.4s ease;
  width: 100%;
  text-align: center;
  position: absolute;
  line-height: 2em;
  font-weight: bold;
  color: #fff;
  position: absolute;
  top: 0;
  left: 0;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
  border-radius: 4px;
}
.checkbox-wrapper-10 .tgl-flip + .tgl-btn:after {
  content: attr(data-tg-on);
  background: #02c66f;
  transform: rotateY(-180deg);
}
.checkbox-wrapper-10 .tgl-flip + .tgl-btn:before {
  background: #ff3a19;
  content: attr(data-tg-off);
}
.checkbox-wrapper-10 .tgl-flip + .tgl-btn:active:before {
  transform: rotateY(-20deg);
}
.checkbox-wrapper-10 .tgl-flip:checked + .tgl-btn:before {
  transform: rotateY(180deg);
}
.checkbox-wrapper-10 .tgl-flip:checked + .tgl-btn:after {
  transform: rotateY(0);
  left: 0;
  background: #7fc6a6;
}
.checkbox-wrapper-10 .tgl-flip:checked + .tgl-btn:active:after {
  transform: rotateY(20deg);
}
</style>
