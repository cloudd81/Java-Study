package oop0915;

class Parent extends Object {
	int one, two;
	public Parent () {}
	public Parent(int one, int two) {
		this.one=one;
		this.two=two;
	}
} // class end

class Child extends Parent {
	int three;
	public Child() {
		super(); // 생략 가능
	} // end
	public Child(int a, int b, int c) {
		
		// 주의) one, two 멤버 변수가 private면 에러가 난다
		// super.one=a;
		// super.two=b;
		
		super(a, b);	// 상속받은 멤버변수(one, two)에 초기값 전달
		this.three = c;
	} // end
	
	
} // class end

public class Test02_super {

	public static void main(String[] args) {
		// super, super()와 this, this() 활용한 클래스 설계
		
		Child child = new Child(10, 20, 30);
		System.out.println(child.one);
		System.out.println(child.two);
		System.out.println(child.three);
		
		
	} // main() end
} // class end
