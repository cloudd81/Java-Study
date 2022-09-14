package oop0914;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jumin {
	// 멤버변수 field
	private String juminno;	// 주민번호
	
	// 생성자함수 constructor
	public Jumin() {}
	public Jumin(String juminno) {
		this.juminno = juminno;
	} // end
		
	// 멤버함수 method
	public boolean validate() {
		String[] jno=juminno.split("");			// 주민번호 한 글자씩 배열에 담기
		int size=jno.length;					// 주민번호 배열 length
		int[] emp= {2,3,4,5,6,7,8,9,2,3,4,5};	// 유효성 검사를 위해 각 수에 곱해질 값의 배열
		int hap=0;
		// 문) 주민번호가 맞으면 flag 변수값을 true로 대입하시오
		for(int i=0; i<jno.length-1; i++) {
			hap+=Integer.parseInt(jno[i])*emp[i];
		} // for end
		
		boolean flag;		
		if(11-(hap%11)==Integer.parseInt(jno[size-1])) {
			flag = true;
		} else {
			flag = false;
		} // if end
		
		return flag;
	} // validate() end
	
	public void disp() {
		// 생년월일, 성별, 나이, 띠 출력하기
		/*
	        생년월일 : 1989년12월30일
	        성별 : 남자
	        나이 : 32   ->GregorianCalendar클래스 이용
	        띠 :       ->태어난년도%12 (0원숭이 1닭 2개 ~~~~ 11양)
		 */
		
		// 생년월일 출력
		String year=juminno.substring(0,2);
		if(Integer.parseInt(juminno.substring(6,7))<3) {
			year="19"+year;
		} else {
			year="20"+year;
		} // if end
		String month=juminno.substring(2,4);
		String day=juminno.substring(4,6);
		System.out.println("생년월일 : "+year+"년 "+month+"월 "+day+"일");
		
		// 성별 출력
		String gender="";
		if(Integer.parseInt(juminno.substring(6,7))%2==0) {
			gender="여자";
		} else {
			gender="남자";
		} // if end
		System.out.println("성별 : " + gender);
		
		// 나이 출력
		GregorianCalendar now=new GregorianCalendar();
		int age=now.get(Calendar.YEAR)-Integer.parseInt(year)+1;
		
		System.out.println("나이 : " + age);
		
		// 띠 출력
		int zodiac=Integer.parseInt(year)%12;
		switch(zodiac) {
		case 0 : System.out.println("띠 : 원숭이띠");
				 break;
		case 1 : System.out.println("띠 : 닭띠");
				 break;
		case 2 : System.out.println("띠 : 개띠");
		 		 break;
		case 3 : System.out.println("띠 : 돼지띠");
		 		 break;
		case 4 : System.out.println("띠 : 쥐띠");
				 break;
		case 5 : System.out.println("띠 : 소띠");
		 		 break;
		case 6 : System.out.println("띠 : 호랑이띠");
		 		 break;
		case 7 : System.out.println("띠 : 토끼띠");
		 		 break;
		case 8 : System.out.println("띠 : 용띠");
		 		 break;
		case 9 : System.out.println("띠 : 뱀띠");
		 		 break;
		case 10 : System.out.println("띠 : 말띠");
		 		 break;
		case 11 : System.out.println("띠 : 양띠");
		 		 break;
		} // switch-case end
		
	} // disp() end
	
} // class end
