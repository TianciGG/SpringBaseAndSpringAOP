import org.springframework.context.support.ClassPathXmlApplicationContext;

import chauncy.entity.UserEntity;
import chauncy.service.UserService;

public class SpringTest3 {
	public static void main(String[] args) {
		// 1.先加载spring容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
		System.out.println("Spring容器被加载");
		// 2.使用bean的id查找对象
		UserService userService = (UserService) applicationContext.getBean("userService3");
		userService.add();
		System.out.println(userService);
	}
}
