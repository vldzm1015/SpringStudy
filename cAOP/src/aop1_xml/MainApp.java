package aop1_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("aop1_xml/beans.xml");
		
		//targetBean 객체를 얻어와서 함수호출
		MessageBean msg = (MessageBean)container.getBean("targetBean");
		msg.sayHello();
		System.out.println("--------------------------------------------------------");
		msg.ensayHello();
		System.out.println("--------------------------------------------------------");
		msg.test();
	}

}
