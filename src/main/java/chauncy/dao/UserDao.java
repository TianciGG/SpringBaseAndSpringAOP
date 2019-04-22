package chauncy.dao;

import org.springframework.stereotype.Repository;

//标识注入DAO层，默认是以<bean id="userDao" class="chauncy.dao.UserDao"></bean>这种方式配置到Spring容器中
@Repository
public class UserDao {
	
	//验证XML和注解混合使用定义重名bean，是否报错，先执行哪个
	private boolean flag;
	
	public void add() {
		System.out.println("数据库访问层。。。 flag:"+flag);
	}

	public void setFlag(boolean flag) {
		System.out.println("This is flag:"+flag);
		this.flag = flag;
	}
	
	
}
