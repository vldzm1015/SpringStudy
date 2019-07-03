package aop2_xml.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 스프링 설정파일 연동
		// targetBean 객체를 얻어와서 함수 호출
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("aop2_xml/order/beans.xml"); 
		MemberBean bean = ctx.getBean("targetBean",MemberBean.class);

		bean.register();
		System.out.println("---------------------------------------------");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		bean.update("Hola");
		
	}

}
