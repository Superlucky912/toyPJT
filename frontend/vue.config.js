const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,

  outputDir: "../backend/demo/src/main/resources/static",

  devServer: {
    // target : "http://127.0.0.1:8080/"
  },
});
