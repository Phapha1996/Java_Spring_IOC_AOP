package org.fage.other;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect//声明是一个切面类
@Component
public class MyAspect {
	/*@Pointcut("execution(publc * org.fage.dao.UserDao.*(..))")切面
	    public void myDao() {}*/

	/*@Before("execution(public void org.fage.dao.UserDao.add(org.fage.domain.User))")
	public void beforeMethod(){
		System.out.println("在方法之前");
	}
	@AfterReturning("execution(public void org.fage.dao.UserDao.add(org.fage.domain.User))")
	public void afterMethod(){
		System.out.println("在方法之后");
	}
	@AfterThrowing抛出异常之后
	@After --- finally
	*/
	
	//环绕
	@Around("execution(public void org.fage.dao.UserDao.add(org.fage.domain.User))")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
		System.out.println("在方法之前");
//		pjp即为代理的对象
        Object retVal = pjp.proceed();
        System.out.println("在方法之后");
        // stop stopwatch
        return retVal;
    }
	
}
