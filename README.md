# 项目简介 Project Overview
**盛安德食品车定位与展示系统** 是一个基于位置信息筛选并展示附近食品车详细信息的软件项目。本项目旨在为用户提供快速、准确的食品车定位服务，提升用户获取周边食品车信息的便利性。

Shinetech Food Truck Localization and Display System is a software project that utilizes location information to filter and present detailed information about nearby food trucks. The objective of this project is to provide users with a rapid and precise food truck localization service, enhancing their convenience in obtaining information about surrounding food trucks.

由于建议时间有限(3小时), 所以在有限的时间内我选择尽量展示自己技术与工程能力而没有选择做更丰富或更有想法的功能, 所以你可以看到功能方面比较简单, 但是使用到的技术会比较多。

Given the limited time constraint (3 hours), I chose to showcase my technical and engineering capabilities rather than implement more extensive or innovative features. Hence, you'll find the functionality relatively straightforward, yet the technologies utilized are diverse.
# 核心依赖 Core Dependencies
### 前端 Frontend
``` shell script
React 18.0.0
Taro 3.6.23
```
### 后端 Backend
```shell script
JAVA 17
Spring Boot 3.2.2
Easyexcel 3.3.3
```
 
# 快速运行(H5) Quick Start (H5)
```shell script
# 1. 下载并切换到项目根目录 Download and navigate to the project root directory  
git clone https://github.com/159957893905/Food-Truck.git && cd ./Food-Truck

# 2. 编译 Compilation  
# 这里前端选择的是编译成H5代码(build:h5), 也可以支持编译成微信小程序(build:weapp)、百度小程序(build:swan)、支付宝小程序(build:alipay)等多个平台 
# The frontend is compiled into H5 code (build:h5) by default, but it also supports compilation for multiple platforms such as WeChat Mini Programs (build:weapp), Baidu Mini Programs (build:swan), and Alipay Mini Programs (build:alipay)  
npm install -p web && npm run build:h5 --prefix web && mvn clean install -DskipTests=true  

# 3. Docker部署 Docker Deployment
docker-compose build && docker-compose up -d --force-recreate

# 4. 浏览器访问 Browser Access
# 容器启动后还需等待1分钟左右, 等java服务启动完毕才可访问
# After the container starts, wait for approximately 1 minute for the Java service to initialize before accessing  
http://localhost:8080/
```
请注意，以上假设您已经安装了必要的开发工具（如Node.js、npm、Java、Maven、Docker等）, 并且如果用的是PowerShell则需要将以上指令中的``&&``改为``;``

Please note that the above instructions assume you have already installed the necessary development tools such as Node.js, npm, Java, Maven, and Docker.