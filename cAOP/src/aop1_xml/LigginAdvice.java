package aop1_xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LigginAdvice {
	public Object around(ProceedingJoinPoint point) throws Throwable {
		
		
		String methodName = point.getSignature().getName();
		System.out.println("사전작업 : " + methodName);
		
		
		Object obj = point.proceed();
		System.out.println("사후작업 : " + methodName);
		
		
		return obj;
	}
	public void before(JoinPoint point) throws Throwable {

		String methodName = point.getSignature().getName();
		System.out.println("[****사전작업****] : " + methodName);
		
		
		
	}
	
//	public void after(Processor p) throws Throwable {
//
//		Object obj =  p.process();
//		System.out.println("[****사후작업****] : " +  methodName);
//		
//		
//		
//	}
}
