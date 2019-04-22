import org.springframework.context.support.ClassPathXmlApplicationContext;

import chauncy.entity.UserEntity;

public class SpringTest1 {
	public static void main(String[] args) {
		// 1.先加载spring容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");
		System.out.println("Spring容器被加载");
		// 2.使用bean的id查找对象
		UserEntity userEntity1 = (UserEntity) applicationContext.getBean("userEntity");
		UserEntity userEntity2 = (UserEntity) applicationContext.getBean("userEntity");
		// 判断对象在Spring中是否单例存在，比较两个对象的内存地址是否一样，若一样则证明Spring默认是单例的，线程不安全。
		System.out.println(userEntity1 == userEntity2);
	}
}
