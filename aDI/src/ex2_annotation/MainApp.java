package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cxt = 
				new ClassPathXmlApplicationContext("ex2_annotation/apConfig.xml");
		
//		MemberBean mem = cxt.getBean("memberBean",MemberBean.class); 
//		mem.output();
		
		MemberDao dao = cxt.getBean("memberDao",MemberDao.class); 
		dao.insert();

	}

}
