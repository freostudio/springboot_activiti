# springboot_activiti
springboot_activiti实现BPM流程Demo
Activiti + Spring JPA with Spring Boot实现BPM流程引擎，我们工作流少不了流程引擎，Java中有很多流程引擎，而Activiti是开源的出色流程引擎，我们将SpringBoot与Activiti结合实现工作流

具体博客请参考：甫义工作室
https://www.toutiao.com/i6707391431717159432/


1.需求（目标实现）

![image](https://github.com/1600690028/springboot_activiti/blob/master/src/test/java/com/zqsw/01.png)

启动流程，完成Task1然后接收Task2任务，完成Task2流程完成。

2.实现过程
-创建SpringBoot项目
-定义流程
-创建数据Model和JPA Repository接口
-创建Service
-创建Appliaction
-创建Controller
-运行

![image](https://github.com/1600690028/springboot_activiti/blob/master/src/test/java/com/zqsw/02.png)

3.项目结构
如下：

![image](https://github.com/1600690028/springboot_activiti/blob/master/src/test/java/com/zqsw/03.png)
