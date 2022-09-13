package oop0905;

public class Test04_operator {

	public static void main(String[] args) {
		// 연산자
		// 산술, 비교(관계), 논리연산자
		// 삼항, 대입, 1증감연산자
		// -> 자바스크립트 참조
		// 비트 연산자 -> 자바에서 자주 쓰이진 않음
		
		System.out.println(5/3);	// 1
		System.out.println(5%3);	// 2
		System.out.println(3/5);	// 0
		System.out.println(3%5);	// 3
		
		System.out.println(3.0/5.0);	// 0.6
		System.out.println(3/5.0);		// 0.6		
		System.out.println(3.0/5);		// 0.6
		System.out.println(3/5.);		// 0.6
		/////////////////////////////////////////////////////////
		
		// 비트연산자, 정보처리와 관련된 개념
		
		// 1) 비트곱, 비트합 연산자
		System.out.println(5&3);		// 1
		System.out.println(5|3);		// 7
		/*
		 	 2진수 : 0 1
		 	 8진수 : 0 1 2 3 4 5 6 7
		 	10진수 : 0 1 2 3 4 5 6 7 8 9 10
		 	16진수 : 0 1 2 3 4 5 6 7 8 9 A B C D E F G
		 	
		 	
		 	5 : 00000101
		 	3 : 00000011
		 	10진수를 2진수로 변환할 때 8 4 2 1 을 기억하면 된다
		 	
		*/
		
		// 2) 비트 부정 연산자
		System.out.println(~5);
		
		// 3) shift 연산자(32비트로 계산)
		System.out.println(16<<3);
		System.out.println(16>>3);
		System.out.println(-16>>>3);
		
		//  16	00010000
		// -16  11110000
		
		
		
	} // main() end
} // class end
