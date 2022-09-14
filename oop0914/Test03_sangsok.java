package oop0914;

// 종단 클래스는 상속받을 수 없다
// final class AA{}

class AA{
	private void zero() {} // 상속되지 않음
	public void one() {
		System.out.println("AA.one()...");
	}
	public void two() {
		System.out.println("AA.two()...");
	}
} // class end

class BB extends AA{ // 자식 클래스 BB, 부모 클래스 AA
	public void three() {
		System.out.println("BB.three()...");
	}
} // class end

class CC extends BB{
	public void four() {
		System.out.println("CC.four()...");
	}
} // class end

/*
에러, 클래스간의 상속은 단일 상속만 가능하다
class DD{
	public void five() {
		System.out.println("DD.five()...");
	}
	public void six() {
		System.out.println("DD.six()...");
	}
} // class end

class EE extends AA, DD{} // class end
*/

public class Test03_sangsok {

	public static void main(String[] args) {
		// 상속 Inheritance
		/*
			- 재활용
			- 부모와 자식, 조상과 후손(파생), super class와 sub class
			- 문법 : extends(확장), implements(구현)
			- 형식) 자식 extends 부모 {}
			
		 */
		
		AA aa = new AA();
		aa.one();
		aa.two();
		//aa.zero(); 에러. private 속성은 클래스 내부에서만 접근 가능하다
		System.out.println("---------------------");
		
		BB bb = new BB();
		bb.three();
		bb.one();
		bb.two();
		//bb.zero(); 에러. private 속성은 상속되지 않는다
		System.out.println("---------------------");
		
		CC cc = new CC();
		cc.four();
		cc.three();
		cc.two();
		cc.one();
		System.out.println("---------------------");
		
	} // main() end
} // class end
