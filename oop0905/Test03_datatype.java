package oop0905;

public class Test03_datatype {

	public static void main(String[] args) {
		// 자료형 datatype
		// -> 기본 자료형
		// -> 참조 자료형(클래스)
		
		// 1. 정수형
		// -> 소수점이 없는 값
		byte	a=1;	// 1바이트 할당
		short	b=3;	// 2바이트 할당, 잘 쓰지 않고 거의 int로 대체됨
		int		c=5;	// 4바이트 할당, 정수형의 가장 기본 자료형
		long	d=7;	// 8바이트 할당
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// int c=9; 에러. 변수명은 중복 선언할 수 없다.
		///////////////////////////////////////////////////////////////////////
		
				
		// 2. 실수형
		// -> 소수점이 있는 값
		float	e=1.2f;	// 4바이트 할당, 접미사 f는 반드시 추가
		double	f=3.4d;	// 8바이트, 실수형의 가장 기본 자료형, 접미사 생략 가능
		
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(3);		// 정수형 int
		System.out.println(3.0);	// 실수형 double
		/////////////////////////////////////////////////////////////////////////////s
		
		
		// 3. 문자형
		// -> 자바는 문자형과 문자열형을 명확하게 구분한다.
		// -> 작은따옴표 ' 로 감싸고, 문자 1개만 저장할 수 있다.
		char ch='R';	// 2바이트 할당
		System.out.println(ch);
		
		ch='가';
		System.out.println(ch);
		
		// ch='SKY'; 에러
		// ch='';	에러
		///////////////////////////////////////////////////////////////////////////
				
		
		// 4. 문자열형
		// -> 큰따옴표 " 로 감싼다
		String str="KOREA";			// String은 원래 클래스이지만 자주 쓰여서 기본형으로 만들어주었다.
		System.out.println(str);
		
		str="A";
		System.out.println(str);
		
		str="";		// 글자갯수 0개
		System.out.println("#" + str + "#");
		
		str=" ";	// 글자갯수 1개
		System.out.println("#" + str + "#");
		////////////////////////////////////////////////////////////////////////////
		
		
		// 5. 논리형
		// -> 맞다(true), 틀리다(false)
		boolean flag=true;
		System.out.println(flag);
		
		flag=false;
		System.out.println(flag);
		
		System.out.println(true);		// boolean형
		System.out.println("true");		// String형
		////////////////////////////////////////////////////////////////////////////
		
		
		// 연습) 성적 프로그램
		String name="무궁화";
		int kor=80, eng=95, mat=100;
		
		// 평균 구하기
		double aver=(kor+eng+mat)/3;
		
		// 출력하기
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("평균 : " + aver); // 91인 이유는 정수형들만으로 계산을 했기 때문
		
	
	}
}
