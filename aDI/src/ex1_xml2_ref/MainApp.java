package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
//		MemberBean mem = context.getBean("mem",MemberBean.class);
//		mem.output();
//		
//		MemberBean mem2 = context.getBean("mem2",MemberBean.class);
//		mem2.output();
		
		
		MemberDao dao = context.getBean("dao",MemberDao.class);
		dao.insert();
		
		MemberDao dao2 = context.getBean("dao2",MemberDao.class);
		dao2.insert();

	}

}
