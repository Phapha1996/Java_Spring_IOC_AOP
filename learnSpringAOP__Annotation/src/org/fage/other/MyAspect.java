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

@Aspect//������һ��������
@Component
public class MyAspect {
	/*@Pointcut("execution(publc * org.fage.dao.UserDao.*(..))")����
	    public void myDao() {}*/

	/*@Before("execution(public void org.fage.dao.UserDao.add(org.fage.domain.User))")
	public void beforeMethod(){
		System.out.println("�ڷ���֮ǰ");
	}
	@AfterReturning("execution(public void org.fage.dao.UserDao.add(org.fage.domain.User))")
	public void afterMethod(){
		System.out.println("�ڷ���֮��");
	}
	@AfterThrowing�׳��쳣֮��
	@After --- finally
	*/
	
	//����
	@Around("execution(public void org.fage.dao.UserDao.add(org.fage.domain.User))")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
		System.out.println("�ڷ���֮ǰ");
//		pjp��Ϊ����Ķ���
        Object retVal = pjp.proceed();
        System.out.println("�ڷ���֮��");
        // stop stopwatch
        return retVal;
    }
	
}
