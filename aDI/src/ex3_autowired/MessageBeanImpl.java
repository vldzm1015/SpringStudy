package ex3_autowired;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ex3_autowired.MessageBean;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String message;
	
	//@Autowired  // 값지정 : 생성자 or setter or @어노테이션
	//@Qualifier("outputer2")
	@Resource(name="outputer")
	private Outputer out;
	
	
	
	//getter , setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	@Override
	public void sayHello() {
		System.out.println(name + "님께" + message );
		
		try {
			out.writeMessage(name + "님께" + message );
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
}