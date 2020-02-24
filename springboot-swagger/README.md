
### SpringBoot整合swagger

参考：https://blog.csdn.net/u012702547/article/details/88775298

1、添加依赖

2、新建配置类

设置basePackage注意项目路径

3、新建controller类，在类、方法上加上相应注解

4、写好后访问 ：http://localhost:8080/swagger-ui.html，就可以看到相应接口

@Api注解可以用来标记当前Controller的功能。

@ApiOperation注解用来标记一个方法的作用。

@ApiImplicitParam注解用来描述一个参数，可以配置参数的中文含义，也可以给参数设置默认值，这样在接口测试的时候可以避免手动输入。

如果有多个参数，则需要使用多个@ApiImplicitParam注解来描述，多个@ApiImplicitParam注解需要放在一个@ApiImplicitParams注解中。

需要注意的是，@ApiImplicitParam注解中虽然可以指定参数是必填的，但是却不能代替@RequestParam(required = true)，前者的必填只是在Swagger2框架内必填，抛弃了Swagger2，这个限制就没用了，所以假如开发者需要指定一个参数必填，@RequestParam(required = true)注解还是不能省略。

如果参数是一个对象（例如更新接口），对于参数的描述也可以放在实体类中。


