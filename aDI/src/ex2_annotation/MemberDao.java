package ex2_annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {

	@Autowired //값이 하나일 때 자동으로 값 지정
	@Qualifier("memberBean2") //@Autowired 와 같이 사용 , 여러가지중에서 하나 골라서 값 지정
//	@Resource(name = "memberBean2") //단독사용, 여러가지중에서 하나 골라서 값 지정
	private MemberBean member;
	
//	//생성자
//	public MemberDao() {}
//	
//	public MemberDao(MemberBean member) {
//		this.member = member;
//	}
	
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
	
	
	public void insert() {
		System.out.println(member.getName()+"님 정보가 입력됩니다.");
	}
}
