import org.springframework.context.support.ClassPathXmlApplicationContext;

import chauncy.entity.UserEntity;

public class SpringTest2 {
	public static void main(String[] args) {
		// 1.先加载spring容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
		System.out.println("Spring容器被加载");
		// 2.使用bean的id查找对象
		UserEntity userEntity = (UserEntity) applicationContext.getBean("staticFactoryUserEntity");
		System.out.println(userEntity.toString());
	}
}
