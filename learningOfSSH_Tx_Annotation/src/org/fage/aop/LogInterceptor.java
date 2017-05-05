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
		System.out.println("�û��Ѿ���ʼ���Ե�½");
        Object retVal = pjp.proceed();
        System.out.println("�û���½�ɹ���");
        // stop stopwatch
        return retVal;
    }
	
	@AfterThrowing("myMethod()")
	public void exception(){
		System.out.println("��½ʧ��!!");
	}
	
}
