package oop0906;

public class Test05_quiz {
	public static void main(String[] arg) {
		// 연습문제
		//문1)알파벳을 아래와 같이 한줄에 5개씩 출력하시오
        /*
           ABCDE
           FGHIJ
           KLMNO
           PQRST
           UVWXY
           Z
        */
		
		for(int a='A'; a <= 'Z'; a++) {
			if(a%10==9 || a%10==4) {
				System.out.print((char)a);
				System.out.println();
			} else {
				System.out.print((char)a);
			} // if end
		} // for end
		
		System.out.println("\n--------------------\n");
		
		// 강사님 풀이
		int count=0;
		for(char ch='A'; ch<='Z'; ch++) {
			count++;
			System.out.print(ch);
			// System.out.println(count);
			if(count%5==0) {
				System.out.println();
			}// if end
		}// for end
		
		System.out.println("\n--------------------\n");
		
		///////////////////////////////////////////////////
		
		//문2)아래와 같이 출력하시오
        /*
           ####
            ###
             ##
              #
        */
		
		for (int l=1; l<5; l++) {
			for (int s=1; s<l; s++) {
				System.out.print(" ");
			}
			for (int s=5; s>l; s--) {
				System.out.print('#');
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------\n");
		
		//////////////////////////////////////////////////
		
		/* 문3)
        1   2   3   4   5      99
        ─ - ─ + ─ - ─ + ─ ...     ──   = ?
        2   3   4   5   6      100
		 */
		
		double m=0.0;
		double s=0.0;		
		for (m=1 ; m<=99 ; m++) {
			if(m%2==1) {
				s+=(m/(m+1));
			} else {
				s-=(m/(m+1));
			} 
		} System.out.println(s);
		
		System.out.println("\n--------------------\n");
		
		// 강사님 풀이
		double hap=0.0;
		boolean flag=false;
		for(int c=1; c<100; c++) {
			if(flag) {
				hap = hap - (c/(double)(c+1));
				flag = false;
			} else {
				hap = hap + (c/(double)(c+1));
				flag = true;
			} // if end
		} // for end
		System.out.println(hap);
		System.out.println("\n--------------------\n");
		
		
		//문4)아래와 같이 계산해서 출력하시오
        /*    
           1+....+10=55
           11+....+20=155
           21+....+30=255

           81+....+90=
           91+....+100=955   
        */
		
		int sum=0;
		for(int a=10; a<=100; a+=10) {
			for(int b=a-9; b<=a; b++) {
				sum+=b;
			} // for end
			System.out.println((a-9) + "+....+" + a + "=" + sum);
			sum=0;
		} // for end
		
		System.out.println("\n--------------------\n");
		
		//////////////////////////////////////////////////////////////
		

		//문5)어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때
        //   달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오
		
		int day=0; // 결과값
		double snail = 0.0; // 달팽이
		while(true) {
			day++;
			snail+=3.0;
			if(snail>=13.0) {
				break;
			} else {
				snail-=2.5;
			} // if end
		} // while end
		System.out.println(day + "일");
		
		
		
	} // main() end
} // class end
