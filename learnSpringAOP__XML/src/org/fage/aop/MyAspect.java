package org.fage.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("myAspect")
public class MyAspect {
	
	public void beforeMessage(){
		System.out.println("before在方法之前切入了！！");
	}
	
	public void afterRunningMessage(){
		System.out.println("afterRunning在方法之后切入了！！");
	}
	
	public void afterThrowingMessage(RuntimeException RTexception){
		System.out.println("afterThrowing异常抛出了,如果存在事务，那么事务回滚!,异常信息:"+RTexception.getMessage());
	}
	
	public void afterMessage(){
		System.out.println("after关闭数据库连接，输入输出流close！！");
	}
	
	//Around
	public Object aroundMessage(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around环绕切入前！");
	    Object retVal = pjp.proceed();
	    System.out.println("around环绕切入后！");
	    return retVal;
	}
	
}
