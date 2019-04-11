package io.caoxx123.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimingAspect {
public Object timing(ProceedingJoinPoint joinpoint) throws Throwable {
	System.out.println("the timing start"+joinpoint.getSignature().getName());
	long start=System.currentTimeMillis();
	Object object=joinpoint.proceed();
	System.out.println("the timing start"+joinpoint.getSignature().getName());
	long end=System.currentTimeMillis();
	String x=(end-start>1)?"the method cost "+(end-start)+"ms":"Nomarl";
	System.out.println(x);
	return object;
}
}
