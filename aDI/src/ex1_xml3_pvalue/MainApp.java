package ex1_xml3_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex1_xml3_pvalue/applicationContext.xml");
		

		MemberDao dao = context.getBean("dao1",MemberDao.class);
		dao.insert();
		
		MemberDao dao2 = context.getBean("dao2",MemberDao.class);
		dao2.insert();

	}

}
