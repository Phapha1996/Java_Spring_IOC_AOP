package org.fage.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("myAspect")
public class MyAspect {
	
	public void beforeMessage(){
		System.out.println("before�ڷ���֮ǰ�����ˣ���");
	}
	
	public void afterRunningMessage(){
		System.out.println("afterRunning�ڷ���֮�������ˣ���");
	}
	
	public void afterThrowingMessage(RuntimeException RTexception){
		System.out.println("afterThrowing�쳣�׳���,�������������ô����ع�!,�쳣��Ϣ:"+RTexception.getMessage());
	}
	
	public void afterMessage(){
		System.out.println("after�ر����ݿ����ӣ����������close����");
	}
	
	//Around
	public Object aroundMessage(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around��������ǰ��");
	    Object retVal = pjp.proceed();
	    System.out.println("around���������");
	    return retVal;
	}
	
}
