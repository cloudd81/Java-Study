package oop0913;

public class Sawon {
	// 멤버 변수 field
	String sabun;	// 사원번호
	String name;	// 이름
	int pay;		// 급여
	
	// 생성자 함수 constructor
	public Sawon () {}

	//생성자 함수 자동 코딩
    //메뉴Source ->Generate Constructor using Fields...
	public Sawon(String sabun, String name, int pay) {
		// super(); 자바에서 부모 관계를 나타낼 때 쓰임
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	} // end
	
	// static 변수(주로 구분하기 위해 전체를 대문자로 쓰는 경우가 많다)
	static String COMPANY = "(주)아이티윌";
	static int SUDANG = 10;
	static double TAX = 0.03;
	
	// static 함수
	static void line() {
		System.out.println("-------------------------------");
	} // line() end
	
	// 멤버 함수 method

} // class end
