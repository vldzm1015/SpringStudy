package ex1_xml4_list;

public class MemberBean {
	
	private String name;
	private int age;
	private String message;
	
	
	// mem을 위한 기초생성자 함수 생성
	public MemberBean() {
		
	}
	
	
	// mem2에서 받을 인자 3개를 받는 생성자 함수를 만들어줌
	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}

	
	
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void output() {
		System.out.println(name + "[" + age + "]" + message );
	}
	
	
	//getter
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getMessage() {
		return message;
	}

	
	



	
	
}
