#micaicms-web-modules-archetype
Maven之自定义archetype生成多模块结构的基础项目骨架

一：项目骨架介绍
该项目骨架集成了Spring，SpringMVC，MyBatis，jsp，jquery，bootstrap等

二：项目骨架使用介绍
1.首先下载该项目到你的本地工程

2.通过dos窗口进入到该工程的pom.xml所在目录

3.搭建nexus私服

4.配置发布到私服的用户，主要是maven的settings.xml，如下
<server>
  <id>releases</id>
  <username>admin</username>
  <password>admin123</password>
</server>
<server>
  <id>snapshots</id>
  <username>admin</username>
  <password>admin123</password>
</server>

5.执行mvn clean install命令

6.执行mvn deploy命令

7.登录nexus可以查看到你刚才发布的archetype包

三：在eclipse或者sts里面配置你刚才发布到私服的自定义archetype
1.打开你的开发工具，eclipse或者sts，我这里是sts

2.选择Window->Preferences->Maven->Archetypes

3.点击Add Remote Catalog，输入你的nexus私服中archetype的地址，我这里是
http://127.0.0.1:8081/nexus/content/groups/public/archetype-catalog.xml
输入Description，随便输入都可以，我这里是micaicms-web-modules-archetype

4.点击Ok，点击Apply

5.重新启动你的开发工具eclipse或者sts

四：使用自定义的archetype生成自定义的项目骨架
1.选择New->Maven Project->Next

2.选择你刚才配置好的那个archetype

3.输入对应的groupId，artifactId，package，点击Finish就会生成四个工程，一个父工程，三个子工程，这样通过自定义的archetype生成多模块基础框架就完成了
，接下来你可以很好的在此基础上写自己的代码了



