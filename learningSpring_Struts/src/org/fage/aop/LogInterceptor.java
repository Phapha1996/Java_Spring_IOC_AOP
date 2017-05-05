package org.fage.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {
	@Pointcut("execution(public * org.fage.dao.UserDao.add(..))")
	public void myMethod(){}
	
	@Around("myMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
		System.out.println("�ڷ���֮ǰ��һ��");
        Object retVal = pjp.proceed();
        System.out.println("�ڷ���֮����һ��");
        // stop stopwatch
        return retVal;
    }
	
}
