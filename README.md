# SpringBaseAndSpringAOP Spring基础知识和SpringAOP
1.测试Spring配置文件中beanId是否允许重复、Spring的默认加载方式是单例还是多例、Spring怎么配置在用到时多例加载：src/main/java/chauncy/entity/UserEntity.java+src/main/resources/spring1.xml+src/test/java/SpringTest1.java
2.SpringIOC创建对象方式的三种方式(无参构造函数、有参构造函数、
工厂创建（静态方法、非静态方法）)：src/main/java/chauncy/entity/UserEntity.java+src/main/java/chauncy/entity/ObjectFactory.java+src/main/resources/spring2.xml+src/test/java/SpringTest2.java
3.DI依赖注入(构造函数、set方法（property标签）、p名称空间、自动装配、注解)：src/main/java/chauncy/dao/UserDao.java+src/main/java/chauncy/service/UserService.java+src/main/resources/spring3.xml+src/test/java/SpringTest3.java
4.注解方式实现AOP编程：src/main/java/chauncy/dao/UserDao.java+src/main/java/chauncy/service/UserService.java+src/main/java/chauncy/service/AOPService.java+src/main/resources/spring4.xml+src/test/java/SpringTest4.java
5.XML方式实现AOP编程：src/main/java/chauncy/dao/UserDao.java+src/main/java/chauncy/service/UserService.java+src/main/java/chauncy/service/AOPService.java+src/main/resources/spring5.xml+src/test/java/SpringTest5.java