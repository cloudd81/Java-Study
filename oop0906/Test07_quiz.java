package oop0906;

public class Test07_quiz {

	public static void main(String[] args) {
		// 2차원 배열 연습문제
		
		char[] ch= {'I','t','W','i','l','l'};
		int size = ch.length;	// 6

		// 문1) 대,소문자의 갯수를 각각 구하시오
		// -> 대문자 : 2개
		// -> 소문자 : 4개
		
		int count1 = 0;
		int count2 = 0;
		for(int r=0; r<size; r++) {
			if(ch[r]>='A' && ch[r]<='Z') {
				count1+=1;
			} else if(ch[r]>='a' && ch[r] <='z') {
				count2+=1;
			} // if end			
		} // for end
		System.out.println("대문자 : " + count1 + "개");
		System.out.println("소문자 : " + count2 + "개");
		
		System.out.println();
		
		// 문2) 대소문자를 서로 바꿔서 출력하시오
		// -> iTwILL
		
		// 내 풀이
//		for(int r=0; r<size; r++) {
//			if(ch[r]>='A' && ch[r]<='Z') {
//				ch[r]=(char)((ch[r])+32);
//			} else if(ch[r]>='a' && ch[r] <='z') {
//				ch[r]=(char)((ch[r])-32);
//			} // if end
//			System.out.print(ch[r]);
//		} // for end
//		System.out.println("\n");
		
		// 강사님 풀이
		for(int r=0; r<size; r++) {
			if(ch[r]>='A' && ch[r]<='Z') {
				System.out.printf("%c", ch[r]+32);
			} 
			if(ch[r]>='a' && ch[r] <='z') {
				System.out.printf("%c", ch[r]-32);
			} // if end
		} // for end
		
		System.out.println("\n");
		
		// 문3) 모음의 갯수를 구하시오 (A E I O U a e i o u)
		// -> 모음의 갯수 : 2개
		int count=0;
		for(int r=0; r<size; r++) {
			if(ch[r] == 'A' ||
			   ch[r] == 'E' ||
			   ch[r] == 'I' ||
			   ch[r] == 'O' ||
			   ch[r] == 'U' ||
			   ch[r] == 'a' ||
			   ch[r] == 'e' ||
			   ch[r] == 'i' ||
			   ch[r] == 'o' ||
			   ch[r] == 'u') {
				count+=1;				
			} // if end
		} // for end
		System.out.println("모음의 갯수 : " + count + "개");
		System.out.println();
		
		
		
		//문4) 각 행의 모음의 갯수를 구하시오.
	    //str[0]행 : 2개
	    //str[1]행 : 1개
	    //str[2]행 : 2개
	    char[][] str= {
	                   {'Y', 'e', 'a', 'r'}
	                  ,{'M', 'o', 'n', 't', 'h'}
	                  ,{'D', 'a', 't', 'e'}
	                  };
		
	    int cntstr=0;
	    for(int r=0; r<str.length; r++) {
			for(int c=0; c<str[r].length; c++) {
				if(str[r][c] == 'A' ||
				   str[r][c] == 'E' ||
				   str[r][c] == 'I' ||
				   str[r][c] == 'O' ||
				   str[r][c] == 'U' ||
				   str[r][c] == 'a' ||
				   str[r][c] == 'e' ||
				   str[r][c] == 'i' ||
				   str[r][c] == 'o' ||
				   str[r][c] == 'u') {
					cntstr+=1;	
				}				
			} // for end
			System.out.println("str[" + r + "]행 : " + cntstr + "개");
			cntstr=0;
		} // for end
	    
	    System.out.println();
		
	    	    
	    
	    //문5) 대각선 방향의 각 요소의 합을 구하시오
	    //대각선 ↘ 방향의 합
	    //대각선 ↙ 방향의 합
	    int[][] num = {
			    		 {4, 3, 2}
			    		,{5, 9, 1}
			    		,{6, 8, 7}
	    			  };
	    
	    int sum1=0;
	    for(int r=0; r<num.length; r++) {
			for(int c=0; c<num[r].length; c++) {				
				if(r==c) {
					sum1+=num[r][c];
				} // if end				
			} // for end
	    } // for end
		System.out.println("대각선 ↘ 방향의 합 : " + sum1);
		
		
	    int sum2=0;
	    for(int r=0; r<num.length; r++) {
	    	int c=0;
			switch (r) {
			case 0: c=2; break;
			case 1: c=1; break;
			case 2:	c=0; break;		
			} // switch end
			sum2+=num[r][c];
		} // for end
		System.out.println("대각선 ↙ 방향의 합 : " + sum2);
		
		
		// 강사님 풀이
		int hap1=0;
		int hap2=0;
		
		for(int i=0; i<num.length; i++) {
			hap1=hap1+num[i][i];
			hap2=hap2+num[i][num.length-1-i];
		} // for end
		
		System.out.printf("\n대각선 ↘ 방향의 합 : %d", hap1);
		System.out.printf("\n대각선 ↙ 방향의 합 : %d", hap2);
	    
	} // main() end
} // class end
