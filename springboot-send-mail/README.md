# Getting Started

### springboot整合mail发送邮件

参考：https://www.jianshu.com/p/5eb000544dd7
    https://github.com/yizhiwazi/springboot-socks
    
#### WebJars

   WebJars是一个很神奇的东西，可以让大家以jar包的形式来使用前端的各种框架、组件。

   WebJars是将客户端（浏览器）资源（JavaScript，Css等）打成jar包文件，以对资源进行统一依赖管理。
 WebJars的jar包部署在Maven中央仓库上。
 
 ##### 为什么使用
   我们在开发Java web项目的时候会使用像Maven，Gradle等构建工具以实现对jar包版本依赖管理，以及项
 目的自动化管理，但是对于JavaScript，Css等前端资源包，我们只能采用拷贝到webapp下的方式，这样做
 就无法对这些资源进行依赖管理。那么WebJars就提供给我们这些前端资源的jar包形势，我们就可以进行
 依赖管理。
