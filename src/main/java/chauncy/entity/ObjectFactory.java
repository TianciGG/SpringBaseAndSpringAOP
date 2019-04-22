package chauncy.entity;

public class ObjectFactory {
	
	/**
	 * 
	 * @methodDesc: 功能描述(实例工厂方法)  
	 * @author: ChauncyWang
	 * @param: @return   
	 * @createTime: 2019年4月22日 上午10:57:29   
	 * @returnType: UserEntity
	 */
	public UserEntity getUserEntity(){
		System.out.println("ObjectFactory->getUserEntity()");
		return 	new UserEntity("Chauncy",19);
	}
	
	
	/**
	 * 
	 * @methodDesc: 功能描述(静态工厂方法)  
	 * @author: ChauncyWang
	 * @param: @return   
	 * @createTime: 2019年4月22日 上午10:57:29   
	 * @returnType: UserEntity
	 */
	static public UserEntity getStaticUserEntity(){
		System.out.println("ObjectFactory->getUserEntity()");
		return 	new UserEntity("Chauncy",20);
	}
}
