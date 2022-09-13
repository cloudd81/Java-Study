package oop0908;

import java.util.StringTokenizer;

public class Test04_quiz {

	public static void main(String[] args) {
		// String 관련 연습문제

		//문1) 이메일 주소에 @문자 있으면
        //    @글자 기준으로 문자열을 분리해서 출력하고
        //    @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오        
        /*    
              출력결과
              webmaster
              itwill.co.kr
        */
		
		String email=new String("webmaster@itwill.co.kr");
		
		/*
		내 풀이
		
		StringTokenizer st= new StringTokenizer(email, "@");
		if(st.countTokens()==1) {
			System.out.println("이메일 주소 틀림");
		} else {
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			} // while end
		} // if end
		*/

		// 강사님 풀이
		if(email.indexOf("@")==-1) {
			System.out.println("이메일 주소 틀림!!");
		} else {
			System.out.println("이메일 주소 맞음");
			
			int pos=email.indexOf("@");
//			System.out.println(pos); // 9 > 골뱅이는 9번째에 있음
			
			String id = email.substring(0, pos); // 문자의 꼬리말 공간 확보
			String sever = email.substring(pos+1);
			
			System.out.println(id);
			System.out.println(sever);
		}
		
		
		//문2) 이미지 파일만 첨부 (.png .jpg .gif)
        /*     
               출력결과 
               파일명 : sky2022.09.08
               확장명 : png
        */

		String path=new String("i:/frontend/images/sky2022.09.08.jpg");

		/*
		내 풀이
		String[] word = path.split("/");
		String tmp = new String(word[word.length-1]);
		String[] ext = tmp.split("");
		System.out.println(ext.length);
		
		// 파일명 출력하기
		System.out.print("파일명 : ");
		for(int i=0; i<ext.length; i++) {
			if(i<ext.length-4) {
				System.out.print(ext[i]);
			} // if end
		} // for end
		
		// 확장명 출력하기
		System.out.print("\n확장명 : ");
		for(int i=0; i<ext.length; i++) {
			if(i>ext.length-4){
				System.out.print(ext[i]);
			} // if end
		} // for end
		System.out.println();
		*/
		
		
		// 강사님 풀이
		
		// 마지막 "/" 기호의 순서값
		int lastSlash=path.lastIndexOf("/");
//		System.out.println(lastSlash);	// 18
		
		// 전체 파일명
		String file = path.substring(lastSlash+1);
//		System.out.println("전체 파일명 : " + file);
		
		int lastDot = file.lastIndexOf(".");
//		System.out.println(lastDot);	// 13
		
		String fname = file.substring(0, lastDot); // 문자의 꼬리말 공간 확보
		String ext = file.substring(lastDot+1);
		
		System.out.println("파일명 : " + fname);
		System.out.println("확장명 : " + ext);
		
		// 확장명을 전부 소문자로 치환
		ext=ext.toLowerCase();
		if(ext.equals("png") || ext.equals("jpg") || ext.equals("gif")) {
			System.out.println("파일이 전송되었습니다");
		} else {
			System.out.println("이미지 파일만 가능합니다");
		}
		
		
		
	} // main() end
} // class end
