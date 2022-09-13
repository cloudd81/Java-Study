package oop0913;

import java.util.Calendar;

// 1) final 클래스(종단 클래스)
/*
final class Animal{} // class end
class Elephant extends Animal {} 에러, final 클래스는 상속받을 수 없다
*/

// 2) final 메소드
class Fruit{
	void view() {}
	final void disp() {}
} // class end

class Apple extends Fruit{ // 자식 클래스 extends 부모클래스
	
	@Override // <- annotation, 재정의(리폼)
	void view() {}
	
	/*
	@Override
	void disp() {} 에러. final 메소드는 더 이상 override 할 수 없다
	 */
	
} // class end

public class Test03_final {

	public static void main(String[] args) {
		// final 마지막, 값을 못바꾸는 상수화 시키는 개념(자바스크립트 : const)
		// 변수		: 변수를 상수화
		// 함수		: 더 이상 리폼(override 재정의)할 수 없다
		// 클래스	: 종단 클래스, 후손 클래스를 만들 수 없다
		
		int a=3;
		a=5;
		
		final int b=2;
		// b=4; 에러. final 변수는 다른 값으로 대입이 불가능하다.
		
		// Calendar 클래스에서 제공되는 값들
		System.out.println(Calendar.YEAR);		// 1
		System.out.println(Calendar.MONTH);		// 2
		System.out.println(Calendar.DATE);		// 5
		
		System.out.println(Calendar.HOUR);		// 10
		System.out.println(Calendar.MINUTE);	// 12
		System.out.println(Calendar.SECOND);	// 13
		/*
			class Calendar {
				static final int YEAR=1;
				static final int MONTH=2;
				static final int DATE=5;				
			}
		 */
		// Calendar.Year=2022; final 변수 값은 변경할 수 없다
		
	} // main() end
} // class end
