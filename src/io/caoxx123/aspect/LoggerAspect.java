package io.caoxx123.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggerAspect {
	@Around(value = "execution(* io.caoxx123.service.ProductService.*(..))")
	public Object log(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("start log"+joinpoint.getSignature().getName());
		Object object=joinpoint.proceed();
		System.out.println("end log"+joinpoint.getSignature().getName());
		return object;
	}
}
