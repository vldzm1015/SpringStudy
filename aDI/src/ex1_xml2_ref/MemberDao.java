package ex1_xml2_ref;

public class MemberDao {

	private MemberBean member;
	
	public MemberDao() {}
	
	public MemberDao(MemberBean member) {
		this.member = member;
	}
	
	public void setMember(MemberBean member) {
		this.member = member;
	}
	
	
	public void insert() {
		System.out.println(member.getName()+"님 정보가 입력됩니다.");
	}
}
