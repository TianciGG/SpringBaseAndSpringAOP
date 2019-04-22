package chauncy.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component
//标识为切面
//@Aspect
public class AOPService {
	
	
	//关注点，开启事务
	//前置通知
	//@Before("execution(* chauncy.service.UserService.add(..))")
	public void begin(){
		System.out.println("##########使用springAOP前置通知，开启事务。。。");
	}
	
	//提交事务
	//后置通知
	//@After("execution(* chauncy.service.UserService.add(..))")
	public void commit(){
		System.out.println("##########使用springAOP后置通知，提交事务。。。");
	}
	
	//异常通知
	//@AfterThrowing("execution(* chauncy.service.UserService.add(..))")
	public void error(){
		System.out.println("##########springAOP异常通知");
	}
	
	
	//运行通知(无异常时才会执行)
	//@AfterReturning("execution(* chauncy.service.UserService.add(..))")
	public void run(){
		System.out.println("##########springAOP运行通知");
	}
	
	//环绕通知
	//@Around("execution(* chauncy.service.UserService.add(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("##########springAOP环绕通知-之前");
		proceedingJoinPoint.proceed();
		System.out.println("##########springAOP环绕通知-之后");
	}
}
