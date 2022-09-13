package oop0907;

public class Test02_method {
	
	public static int test1(int a, int b) {
		int c=a+b;
		// return; 리턴값이 없다(void)
		return c;	// 리턴값이 있는 경우 리턴값의 자료형을 void 자리에 쓴다
					// 리턴값은 1개 값만 리턴할 수 있다
	} // test1() end
	
	public static String test2(int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";			
		} // if end
	} // test2() end
	
	public static boolean test3(int a) {
		if(a%4==0) {
			if(a%400!=0 && a%100==0) {
				return false;
			} else {
				return true;
			} // if end
		} else {
			return false;
		} // if end
	} // test3() end
	
	public static long test4(int n) {
		long gop=1;
		for(int a=n; a>=1; a--) {
			gop*=a;
		} // for end
		return gop;
	} // test4() end
	
	public static long fact(int n) {
		if(n==0) {
			return 1;
		} else {
			return n*fact(n-1);
		} // if end
	} // fact() end
	
	
	public static void main(String[] args) {
		// 2. 리턴값이 있는 경우
		
		// System.out.println(Math.abs(-3));
		// System.out.println(Math.max(5, 7));
		
		int result = test1(2, 4);
		System.out.println(result);
		
		// 값 : 상수값, 변수값, 리턴값
		System.out.println(test1(5,6));
		
		
		// 짝수, 홀수 출력하기
		String str=test2(7);
		System.out.println(str);
		
		
		// 윤년 확인하기
		if(test3(2022)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		} // if end
		
		
		// 팩토리얼 구하기
		long f = test4(5);
		System.out.println(f);
		
		
		
		// 3. 재귀적 함수 호출
		// 팩토리얼 값 구하기
		System.out.println(fact(5));
		
		
	} // main() end
} // class end
