package oop0914;

class Korea{
	String name="대한민국";
	final void view() {
		System.out.println("Korea.view()...");
	} // view() end
	void disp() {
		System.out.println("Korea.disp()..." + name);
	} // disp() end
} // class end

class Seoul extends Korea{} // class end

class Busan extends Korea{
	String name="부산광역시";
	
	@Override		// <- annotation
	void disp() {
		System.out.println("Busan.disp()..." + name);
	} // disp() end
	
	/*
	@Override		// <- annotation
	void view() {} // final 메소드는 오버라이드가 불가능하다
	*/
} // class end


public class Test04_override {

	public static void main(String[] args) {
		// Method Override 함수 재정의
		// -> 상속관게에서 물려받은 메소드를 다시 수정(리폼)
		
		
		// 1) 오버라이드 하기 전
		Seoul se = new Seoul();
		se.disp();
		se.view();
		
		// 2) 오버라이드 한 후
		Busan bu = new Busan();
		bu.disp();
		bu.view(); // final 메소드는 상속은 가능하지만 오버라이드는 할 수 없다

	} // main() end
} // class end
