package aop4_annotation.order;

import org.springframework.stereotype.Component;

@Component("targetBean")
public class MemberBeanImpl implements MemberBean {

	@Override
	public void register() {
System.out.println("register 호출");
	}

	@Override
	public boolean update(String name) {
System.out.println(name +"~");
		return false;
	}

}
