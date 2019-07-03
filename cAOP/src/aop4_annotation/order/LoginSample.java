package aop4_annotation.order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect 
@Component	
public class LoginSample {
	
	
	@Before("execution(public * *(..))")
	public void before(JoinPoint p) {
		System.out.println("before~~~~" + p);
	}
	
	@AfterReturning("execution(public * *(..))")
	public void afterReturn(JoinPoint p ) {
		System.out.println("after~~~~" + p);
	}
}
