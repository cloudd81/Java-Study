package oop0915;

import oop0915.WebProgram.Language;
import oop0915.WebProgram.Smart;

class WebProgram {		// 웹페이지를 작성할 때 사용하는 언어
						// .jsp		.py		.asp	.php

	String title="Java Program";
	
	class Language{
		String basic="Java, HTML, CSS, JavaScript";
		void display() {
			System.out.println("기초수업:" + basic);
		} // end
	} // inner class
	
	class Smart{
		String basic="Objective-C, Java OOP, C#";
		void display() {
			System.out.println("기초수업:" + basic);
		} // end
	} // inner class
	
	public void print() {
		Language lang = new Language();
		lang.display();
		
		Smart sm = new Smart();
		sm.display();
	} // print() end
	
} // class end




public class Test09_inner {

	public static void main(String[] args) {
		// 내부 클래스 inner class
		// -> 클래스 내부에서 선언된 클래스
		
		WebProgram web = new WebProgram();
		web.print();
		
		// 에러. 내부클래스는 직접 접근할 수 없다
		// Language lang = new Language();
		// Smart sm = new Smart();
		
		// 내부클래스는 외부에서 단계적으로 접근할 수 있다.
		Language lang = new WebProgram().new Language();
		lang.display();
		
		Smart sm = new WebProgram().new Smart();
		sm.display();
		/////////////////////////////////////////////////////////
		/*
			안드로이드(구글사에서 만든 모바일 전용 OS)
			class R {
				class id{
					String btn="버튼";
				}
			}
			
			접근방식 R.id.btn
		 */
		
	} // main() end
} // class end
