package ex04;

import java.util.Arrays;

/*
 * 배열 10개 방에 랜덤하게 1~100사이 값을 저장
 * 배열에서 최대값, 최소값을 구하기
 * 10개 값의 총첨/평균
 * 10개 값을 정렬(오름차순)
 */
public class 연습문제 {
	
	public static void main(String[] args) {

	int[] iArr = new int[10];
	//배열 10개 방에 랜덤하게 1~100사이 값을 저장
	for(int i=0; i<10; i++) {
		iArr[i]=(int)(Math.random()*100)+1;
	}
	System.out.println(Arrays.toString(iArr));
    
	//배열에서 최대값, 최소값 구하기
	int max, min;
	max = min = iArr[0]; //[0]값을 max랑 min에 넣는다
	for(int i=0; i<iArr.length; i++) {
		
		if(max < iArr[i]) {
			max = iArr[i];
		}	
		if(min > iArr[i]) {
			min = iArr[i];
			
		}
	 }
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//총점/평균구하기
		int sum=0;
		double avg=0;
		
		for(int i = 0; i<10; i++)
			sum += iArr[i];
		
		
		
		avg = (double)sum/iArr.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		//오름차순(버블정렬)
		for(int i=0; i<iArr.length; i++) {
		
			for(int j=0; j<iArr.length -i -1; j++) {
				
				if(iArr[j]>iArr[j+1]) {
					int tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
					
				//i오류날때는 괄호 체크 할것!!
				} //end if
			} //end j
		} //end i
		System.out.println("정렬 : " + Arrays.toString(iArr));		
	 
   }
}