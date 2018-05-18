# Flyabbit

目录 :

## 简介

- [前言](##前言)
- [分支说明](##分支说明)
- [依赖说明](##依赖说明)
- [结构](#结构)
- [效果](#效果)
- [相关文章](##相关文章)
- [关于个人](##关于个人)


## 前言

<div >   
 <img src="http://i.imgur.com/4498nb3.jpg" width = "500" height = "250" alt="图片名称" align=center />
</div>


- 技术选型
- 组件化设计
- 本地Maven (nexus)简单使用
- 自动打包(Jenkins持续集成)
- 单元测试-
- 线上Bug快速修复(热修复)
- ReactNative-Android 的简单实践
- 阿里Atlas(插件化)与该项目的简单实践


**集android技术于一体,你们想要的都在这里**



## 分支说明

   - master : 主分支以MVP和组件化更新为主
   - feature-rn : rn特色分支 :主要以更新rn与Android结合实践优化为主
   - feature-atlas : 以阿里Atlas插件化结合为主


## 依赖说明

### **组件化脚本插件** 

[ ![Download](https://api.bintray.com/packages/chengzichen/maven/component-plugin/images/download.svg) ](https://bintray.com/chengzichen/maven/component-plugin/_latestVersion)
[![License](https://img.shields.io/badge/License-Apache%202.0-orange.svg)](https://github.com/luojilab/DDComponentForAndroid/blob/master/LICENSE) 


感谢 [@DDComponentForAndroid](https://github.com/luojilab/DDComponentForAndroid) ,我只是对其进行了修改更适合自己的项目.用法基本没有改变

 [Gradle脚本的使用](https://github.com/chengzichen/Flyabbit/blob/master/%E7%BB%84%E4%BB%B6%E5%8C%96%E7%9A%84%E4%BD%BF%E7%94%A8.md) 





### **FMVP**



[ ![Download](https://api.bintray.com/packages/chengzichen/maven/mvp/images/download.svg) ](https://bintray.com/chengzichen/maven/mvp/_latestVersion) 

特点:   

-  `degger2` ,`util`....每个Modle中提供了`XXDiHelper` 快速使用AOP依赖注入,一键注入你想要的
-  `rxjava`,`retrofit`让网络请求线程切换赢在起跑线上
-  使用`ARouter`路由解耦跳转更加灵活
- ` MVP`更加简单实用,网络,缓存,数据库开箱即用
-  `base`中封装了懒加载的`BaseFragment`,`BaseActivity`,满足你日常开发的各种动作和姿势
- `room`,`MemoryCache`,`SPHelper`和` RxCache `提供了强大的网络请求和缓存功能
- 使用`AccountManager`提供了登录用户资料的简单管理


-----


### (三) 日志管理(**Timber**)
 
 [ ![Download](https://api.bintray.com/packages/chengzichen/maven/timberhelper/images/download.svg) ](https://bintray.com/chengzichen/maven/timberhelper/_latestVersion)

 特点: 整合了timber和logger日志框架,一行代码初始化,debug打印日志,release异步保存错误日志到指定的位置. 



### (四)事件总线(**RxBus**) 

[ ![Download](https://api.bintray.com/packages/chengzichen/maven/rxbus2/images/download.svg) ](https://bintray.com/chengzichen/maven/rxbus2/_latestVersion)

 特点: 提供普通的消息通知,以及粘性消息通知,使用了Rxjava必备神器
 
 

**Step 1. 在根目录的gradle文件中配置**


	allprojects {
			repositories {
				...
				 jcenter()
			}
		}


**step2 添加依赖(By 3.0):**


	dependencies {

	       api 'com.dhc.rxbus:rxbus2:1.0.0'
	}




### 混淆


- android混淆说明
	
	混淆文件都在了`app/proguard-pro`目录下,第三方库的混淆都提供了,满足日常开发,除了第三方开源库之外,在`app/proguard-pro/proguard-self.pro`中还有项目特有的混淆方式.需要添加就在改文件中添加混淆
	


## 结构
 
 <img src="https://i.imgur.com/sEuZMdp.png" width = "400" height = "400" alt="图片名称" align=center />

 
## 效果


![Image text](https://github.com/chengzichen/Photo/raw/master/gif/show.gif)


## 相关文章

第一篇-网络篇:

 - [[从零开始系列]AndroidApp研发之路(一) 网络请求的封装(一)](http://blog.csdn.net/chengzichen_/article/details/77659318)

第二篇-Retrofit源码解析

  - [[从零开始系列]AndroidApp研发之路-<楼外篇>Retrofit的刨根问底篇](http://blog.csdn.net/chengzichen_/article/details/77840996)
  
  更新中....
  
## 关于个人
 
  
  Github:[https://github.com/chengzichen](https://github.com/chengzichen)
  
  CSDN : [http://blog.csdn.net/chengzichen_](http://blog.csdn.net/chengzichen_)
  
  个人博客 : [https://chengzichen.github.io/](https://chengzichen.github.io/)
<div  align="center"> 
  加入我们畅聊吧 
</div>
<div  align="center">   
 <img src="https://i.imgur.com/J1LpBum.jpg" width = "200" height = "300" alt="图片名称" align=center />
</div>
