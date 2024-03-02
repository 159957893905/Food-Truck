import type { UserConfigExport } from "@tarojs/cli";
export default {
  logger: {
    quiet: false,
    stats: true
  },
  mini: {},
  h5: {
    devServer: {
      port: 10086,
      proxy: {
        '/api': {  
          target: 'http://localhost:8080', // 你的后端 API 地址  
          changeOrigin: true, // 开启代理，在本地创建一个虚拟服务器，然后发送请求的数据，会同时会收到请求的数据，这样服务端和服务端进行数据的交互就不会有跨域问题  
        }
      }  
    },
  },
} satisfies UserConfigExport
