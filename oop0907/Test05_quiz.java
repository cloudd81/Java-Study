package oop0907;

public class Test05_quiz {

	
	public static double sd(int[] a) {
		int size=a.length;
		
		// 1)
		double sum=0.0;
		double avg=0.0;
		for(int i=0; i<size; i++) {
			sum+=a[i]; // a요소들의 총합
		} // for end
		avg=sum/size; // a요소들의 총합의 평균, 87.2
		
		// 2)+3)
		double sum2=0.0;
		for(int j=0; j<size; j++) {
			if(a[j]-avg<0) {
				sum2+=(a[j]-avg)*-1;
			} else {
				sum2+=(a[j]-avg);
			} // if end
		} // for end
		
		return sum2/size;
		
	} // sd() end
	
	/* 한이 풀이
	   public static double sd(int[] a) {
	   
	      //1)평균
	      double result=0;
	      for(int i=0; i<a.length; i++) {
	         result+=a[i];         
	      }//for end         
	      result=result/a.length;      //87.2
	      
	      //2)편차
	      double[] b = new double[a.length];
	      for(int i=0; i<a.length; i++) {
	         b[i]=a[i]-result;
	         b[i]=Math.abs(b[i]);
	      }//for end
	      
	      //3)표준편차
	      result=0;
	      for(int i=0; i<b.length; i++) {
	         result+=b[i];
	      }//for end
	      return result/b.length;      
   		}//sd() end
   		
	 */
	
	/* 강사님 풀이
	public static double sd(int[] aver) {
		int size=aver.length;
		
		// 1)단계 aver의 각 요소의 누적의 합 구하기
		double hap=0.0;
		for(int i=0; i<size; i++) {
			hap=hap+aver[i];
		} // for end
		
		// aver 배열 요소들의 평균 구하기(87.2)
		double avg=hap/size;
		
		double sum=0.0; // 편차들의 총 합계
		for(int i=0; i<size; i++) {
			// aver의 각 요소에서 avg값과의 차이를 구하고
			double d = aver[i]-avg;
			
			// 2)단계
			// -> avg(87.2)와의 차이값을 전부 양수로 바꾼다(편차)
			d=Math.abs(d);
			
			// 2) 에서 나온 편차들을 누적한다
			sum+=d;
		} // for end
		
		// 3)단계 : 표준편차
		return sum/size;
	}
	*/
		
	
	
	public static void main(String[] args) {
		// 문제) 표준편자(Standard deviation) 구하기
		
//		빅데이터
//		저장, 수업		- 크롤링, 데이터베이스
//		분석, 예측		- 통계(회귀분석, 상관분석)	R
//		비즈니스 모델

		
		int[] aver= {85, 90, 93, 86, 82};
		double result=sd(aver);
		System.out.printf("표준편차 : %.2f", result);

		/*
			1) aver의 평균(87.2)를 구하고, aver의 각 요소에서 87.2를 뺀다
			   85-87.2=-2.2
			   90-87.2=2.8
			   93-87.2=5.8
			   86-87.2=-1.2
			   82-87.2=-5.2

			2) 1)의 값을 전부 양수로 바꾼다 -> 편차
			   2.2
			   2.8
			   5.8
			   1.2
			   5.2

			3) 2)의 편차들의 평균값 : 표준편차
			   (2.2+2.8+5.8+1.2+5.2)/5 -> 3.44		
		*/

	} // main() end
} // class end