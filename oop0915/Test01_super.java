package oop0915;

class School extends Object {
	String name="학교";
		
	public School() {
		System.out.println("School()...");
	}
} // class end

class MiddleSchool extends School {
	
	public MiddleSchool() {
		// 상속 관계에서 부모 생성자 함수 호출 명령어
		super(); // 생략 가능하다
		System.out.println("MiddleSchool()...");
	}
	
	public void disp() {
		System.out.println(name);	// 학교, 부모가 물려준 값 그대로
	} // disp() end
} // class end

class HighSchool extends School {

	String name="고등학교";
	
	public HighSchool() {
		// 상속 관계에서 부모 생성자 함수 호출 명령어
		super(); // 생략 가능하다
		System.out.println("HighSchool()...");
	}
	
	public void disp() {
		String name="강남고등학교";
		System.out.println(name);		// 강남고등학교
		System.out.println(this.name); 	// 고등학교
		System.out.println(super.name);	// 학교
	} // disp() end
} // class end


public class Test01_super {

	public static void main(String[] args) {
		// super 부모, 조상
		// superclasses	부모 클래스들
		// subclasses	자식 클래스들
		
		// super	: 자식 클래스에서 부모 클래스의 멤버에 접근할 떄
		// super()	: 자식 클래스의 생성자 함수가 부모 클래스의 생성자 함수를 호출할 때
		
		// this		: 멤버변수(field)와 일반 지역 변수를 구분하기 위해
		// this()	: 자신의 생성자 함수가 자신의 생성자 함수를 호출할 때
		////////////////////////////////////////////////////////////////////////////////
		
		// 상속관계에서 생성자 함수 호출 순서
		// -> 부모 생성자가 먼저 호출되고 자신의 생성자 함수가 호출된다
		
		// School() -> MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		ms.disp();

		// School() -> HighSchool()
		HighSchool hs = new HighSchool();
		hs.disp();

	} // main() end
} // class end
