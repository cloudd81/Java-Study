package oop0914;

public class Test07_quiz {

	public static void main(String[] args) {
		// 연습문제
		
		//문1)주민번호의 각 숫자의 합을 구하시오 (Character클래스와 charAt()함수 이용)
        //   8+9+1+2+3+0+1+2+3+4+5+6+7
        String jumin="8912301234567";
        
        char a;
        int hap=0;
        for(int i=0; i<jumin.length(); i++) {
        	a=jumin.charAt(i);
        	hap+=Character.getNumericValue(a);
        }
        System.out.println(hap);
        
        //문2)대소문자를 서로 바꿔서 출력하시오 (Character클래스와 charAt()함수 이용)
        //   gONE wITH tHE wIND
        String str="Gone With The Wind";
        
        char b;
        for(int i=0; i<str.length(); i++) {
        	b=str.charAt(i);
        	if(Character.isUpperCase(b)) {
        		System.out.print(Character.toLowerCase(b));
        	} else if(Character.isLowerCase(b)) {
        		System.out.print(Character.toUpperCase(b));
        	} else {
        	System.out.print(b);
        	} // if end
        } // for end
        
        
	} // main() end
} // class end
