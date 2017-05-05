package org.fage.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {
//	@Pointcut("execution(public * org.fage.dao.UserDao.getLogin(..))")
	@Pointcut("execution(public * org.fage.service.UserService.*(..))")
	public void myMethod(){}
	
	@Around("myMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
		System.out.println("用户已经开始尝试登陆");
        Object retVal = pjp.proceed();
        System.out.println("用户登陆成功！");
        // stop stopwatch
        return retVal;
    }
	
	@AfterThrowing("myMethod()")
	public void exception(){
		System.out.println("登陆失败!!");
	}
	
}
