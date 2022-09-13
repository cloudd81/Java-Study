package oop0906;

public class Test08_sort {

	public static void main(String[] args) {
		// 정렬 sort
		/*
			- 정렬 유형
			  오름차순 ascending	1->10	A->Z	a->z	ㄱ->ㅎ
			  내림차순 descending
		
			- 정렬방식
			  삽입정렬 : insertion sort
			  선택정렬 : selection sort
			  버블정렬 : bubble sort			  
		
			- selection sort 알고리즘
			  
			  9 8 7 6 5 -> 5 6 7 8 9
			  가장 앞자리 수가 자기보다 더 작은 가장 최소값과 자리를 바꿔가며
			  차례로 정렬을 하는 방법
			  
			  ex)
			  9 8 7 6 5
			  5 8 7 6 9 > 9가 최소값 5를 찾아서 바꿈
			  --------- step 1
			  5 8 7 6 9
			  5 6 7 8 9 > 8이 다음 최소값 6을 찾아서 바꿈
			  --------- step 2
			  5 6 7 8 9
			  5 6 7 8 9 > 7보다 더 작은 최소값이 없음
			  --------- step 3
			  5 6 7 8 9
			  5 6 7 8 9 > 8보다 더 작은 최소값이 없음
			  --------- step 4
			  5 6 7 8 9
			  5 6 7 8 9 > 9보다 더 작은 최소값이 없음
			  --------- step 5, 정렬 완료			  			
			
			- bubble sort 알고리즘
			  9 8 7 6 5
			  8 9 7 6 5
			  8 7 9 6 5 
			  8 7 6 9 5
			  8 7 6 5 9
			  ---------- step 1
			  8 7 6 5 9
			  7 8 6 5 9
			  7 6 8 5 9
			  7 6 5 8 9
			  ---------- step 2
			  7 6 5 8 9
			  6 7 5 8 9
			  6 5 7 8 9 
			  ---------- step 3
			  6 5 7 8 9 
			  5 6 7 8 9
			  ---------- step 4
			  5 6 7 8 9
			  ---------- 정렬 완료
		 */
		
		int[] su= {9, 8, 7, 6, 5};
		int size = su.length;

		// selection sort
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
				if(su[a]>su[b]) {			// 오름차순
					int temp=su[a];
					su[a]=su[b];
					su[b]=temp;					
				} // if end
			} // for end
		} // for end
		
		for (int idx=0; idx<size; idx++) {
			System.out.print(su[idx]);
		} //for end
		
		System.out.println();
		System.out.println("------------------------");
		
		
		// bubble sort
		for(int a=size-2; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				if(su[b]<su[b+1]) { // 내림차순
					int temp=su[b+1];
					su[b+1]=su[b];
					su[b]=temp;
				} // if end
			} // for end
		} // for end
		
		for (int idx2=0; idx2<size; idx2++) {
			System.out.print(su[idx2]);
		} //for end
		
		System.out.println();
		System.out.println("------------------------");
			
	} // main() end
} // class end
