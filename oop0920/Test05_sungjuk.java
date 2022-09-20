package oop0920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test05_sungjuk {

	public static void main(String[] args) {
		// 문제) 성적프로그램
		// 성적 입력 자료(sungjuk.txt)를 가져와서, 성적 결과 파일 완성하기(result.txt)
		/*
			1) 입력 데이터 파일 : sungjuk.txt
		
			2) 결과 파일 : result.txt
			
								성 / 적 / 결 /과
              -------------------------------------------------------
              이름     국어   영어  수학   평균  등수   결과
              -------------------------------------------------------
			  라일락    100  100  100   100   1    합격 ********** 장학생
              진달래     50   55   60    55   4    불합격 *****
              개나리     95   95   35    75   3    재시험 *******
			  무궁화     80   85   90    85   2    합격 ********
              홍길동     60   40   30    43   5    불합격 ****
              ------------------------------------------------------	
		 */
				
		String inName = "C:/java202207/sungjuk.txt";
		String outName = "C:/java202207/result.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		PrintWriter out = null;

		
		try {
			// 파일 가져와서 읽기
			fr = new FileReader(inName);
			br = new BufferedReader(fr);

			// 컬렉션 프레임워크 만들기
			ArrayList list = new ArrayList();
			ArrayList name = new ArrayList();
			ArrayList kor = new ArrayList();
			ArrayList eng = new ArrayList();
			ArrayList mat = new ArrayList();
			
			while(true) {
				String line = br.readLine();
				// 값들을 List를 활용해 하나씩 담기
				if(line!=null){
					list.add(line);
				} else if(line==null){
					break;
				}// if end
			} // whlie end
			
			// list에 담긴 것을 각각 ,로 나누고 값에 대입
			for(int i=0; i<list.size(); i++) {
				String str = new String((String)list.get(i));
				String[] stud = str.split(",");
				// stud[]의 값을 각각의 값에 대입
				for(int j=0; j<stud.length; j++) {
					switch(j) {
					case 0 : name.add(stud[j]); break;
					case 1 : kor.add(stud[j]); break;
					case 2 : eng.add(stud[j]); break;
					case 3 : mat.add(stud[j]); break;
					} // switch end
				} // for end
			} // for end

			// 평균 배열 만들기
			int size = name.size();
			ArrayList aver = new ArrayList();
			for(int i=0; i<size; i++) {
				int sum=0;
				sum+=Integer.parseInt((String) kor.get(i));
				sum+=Integer.parseInt((String) eng.get(i));
				sum+=Integer.parseInt((String) mat.get(i));
				aver.add(sum/3);
			}
			
			// 등수 배열 만들기
			int[] rank = {1,1,1,1,1};
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if((int)aver.get(i)<(int)aver.get(j)) {
						rank[i]++;
					} // if end
				} // for end
			} // for end
			
			List rank2 = new ArrayList();
			for(int item : rank) {
				rank2.add(item);
			} // for end
			
			// 통과 배열 만들기
			ArrayList pass = new ArrayList();
            for(int i=0; i<size; i++) {
                if((int)aver.get(i)>=70) {
                    if(Integer.parseInt((String)kor.get(i))<40 ||
                	   Integer.parseInt((String)eng.get(i))<40 ||
                	   Integer.parseInt((String)mat.get(i))<40) {
                        pass.add("재시험");
                    } else {
                    	pass.add("합격");
                    } // if end
                } else {
                	pass.add("불합격");
                } // if end
            } // for end
			
			// 별 배열 만들기
            String[] star = {"","","","",""};
            for(int i=0; i<size; i++) {
            	for(int n=0; n<(int)aver.get(i)/10; n++) {
            		star[i]+="★";
            	} // for end
            } // for end
            
			List star2 = new ArrayList();
			for(String item : star) {
				star2.add(item);
			} // for end
            
            
			// 장학생 배열 만들기
            ArrayList scholar = new ArrayList();
            for (int i=0; i<size; i++) {
                if ((int)aver.get(i)>=95) {
                    scholar.add("장학생");
                } else {
                    scholar.add("-");
                } // if end
            } // for end

			for(int i=0; i<name.size(); i++) {
				System.out.print(name.get(i) + " ");
				System.out.print(kor.get(i) + " ");
				System.out.print(eng.get(i) + " ");
				System.out.print(mat.get(i) + " ");
				System.out.print(aver.get(i) + " ");
				System.out.print(rank2.get(i) + " ");
				System.out.print(pass.get(i) + " ");
				System.out.print(star2.get(i) + " ");
				System.out.print(scholar.get(i) + " ");
				System.out.println();
			}
			
			// 파일 출력하기
			fw = new FileWriter(outName, false);
			out = new PrintWriter(fw, true);
			
			out.println("\t\t\t\t\t 성/적/결/과");
			out.println("----------------------------------------------------------------------------------------------------------");
			out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "평균", "등수", "결과");
			out.println("----------------------------------------------------------------------------------------------------------");
			for(int i=0; i<name.size(); i++) {
				out.printf("%s\t\t", name.get(i));
				out.printf("%s\t", kor.get(i));
				out.printf("%s\t", eng.get(i));
				out.printf("%s\t", mat.get(i));
				out.printf("%s\t", aver.get(i));
				out.printf("%s\t", rank2.get(i));
				out.printf("%s\t", pass.get(i));
				out.printf("%s\t", star2.get(i));
				out.printf("%s\t", scholar.get(i));
				out.println();
			}
			System.out.println("result.txt 데이터 파일 완성!!");


			
		} catch (Exception e) {
			System.out.println("성적 프로그램 읽고, 쓰기 실패 : " + e);
		} finally {
			try {
				if(br!=null) {br.close();}
			} catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}
			} catch (Exception e) {}
			try {
				if(out!=null) {out.close();}
			} catch (Exception e) {}
			try {
				if(fw!=null) {fw.close();}
			} catch (Exception e) {}			
		} // end
		

	} // main() end
} // class end
