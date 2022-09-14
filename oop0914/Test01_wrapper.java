package oop0914;

import java.lang.*; // 자바의 기본 패키지, 생략가능

public class Test01_wrapper {

	public static void main(String[] args) {
		// Wrapper class (포장 클래스)
		// -> 기본 자료형을 참조형화 해놓은 클래스들
		// -> 대부분 java.lang 패키지에 선언이 되어있음
		/*
			기본형			참조형(클래스)
			boolean			Boolean
			byte			Byte
			short			Short
			int				Integer ** 주의
			long			Long
			float			Float
			double			Double
			char			Char
		*/ 
		/////////////////////////////////////////////////////////
		
		boolean boo1=true;
		Boolean boo2=new Boolean("false");	// Deprecated 절판
		Boolean boo3=true;
		
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
		System.out.println(boo3.toString()); // "true"
		////////////////////////////////////////////////////////////
		
		int in1=3;
		Integer in2=new Integer(5);
		Integer in3=7;
		
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		
		System.out.println(in2.toString());		// "5"
		System.out.println(in3.doubleValue());	// 7.0
		
		System.out.println(Integer.toBinaryString(15));	// 2진수 toString
		System.out.println(Integer.toOctalString(15));	// 8진수 toString
		System.out.println(Integer.toHexString(15));	// 16진수 toString
		
		System.out.println(Integer.sum(2, 4));	// 6; 2+4
		System.out.println(Integer.max(2, 4));	// 4
		System.out.println(Integer.min(2, 4));	// 2
	
		// ★★★ 진짜 많이 사용 ★★★
		System.out.println(Integer.parseInt("123")); // "123" -> 123

		// NumberFormatException 에러, 형변환에 맞지 않는 입력 데이터
		// System.out.println(Integer.parseInt("KOREA")); 
		////////////////////////////////////////////////////////////////////////////
		
		
		long lo1=3L;
		Long lo2=new Long(5L);
		Long lo3=7L;
		
		double dou1=2.4;
		Double dou2=new Double("3.5");
		Double dou3=6.7;
		
		// 문) 실수형 값들 중에서 정수의 합을 구하시오
		int hap= (int)(dou1)+dou2.intValue()+dou3.intValue();
		System.out.println(hap);
		//////////////////////////////////////////////////////////////////////////
		
		
		char ch1='R';
		Character ch2='m';
		Character ch3=new Character('a');
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.toLowerCase('R'));
		System.out.println(Character.toUpperCase('a'));
				
	} // main() end
} // class end
