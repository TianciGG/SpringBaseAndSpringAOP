package chauncy.service;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chauncy.dao.UserDao;

//等同于在XML文件中声明<bean id="userService" class="chauncy.service.UserService"></bean>
@Service
public class UserService {
	
	/**
	 * @Resource 默认以属性名称userDao，去找bean对象
	 */
	@Resource
	private UserDao userDao;
	
	public void add(){
		//1/0会报错，模拟异常通知使用场景
		//int i=1/0;
		System.out.println("业务逻辑层。。。");
		userDao.add();
	}

	public void setUserDao(UserDao userDao) {
		System.out.println("UserService的setUserDao方法");
		this.userDao = userDao;
	}
	
	

}
