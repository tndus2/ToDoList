const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,

  // npm run build 타겟 디렉토리 (백엔드 쪽)
  outputDir : "../ToDoList/src/main/resources/static",

  // npm run serve 프론트 개발 서버 포트가 다르기 떄문에 프록시 설정을 해야함
  // target : 백엔드 port가 들어감
  // changeOrigin -> true로 해야 cors 문제 해결 할 수 있음.
  devServer: {
    proxy : {
      '/' : {
        target : "http://localhost:4860",
        changeOrigin: true,
        ws : false,
      }
    }
  },
  lintOnSave:false

})
