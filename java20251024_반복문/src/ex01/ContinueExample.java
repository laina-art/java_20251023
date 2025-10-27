package ex01;

public class ContinueExample {
	
   /*
    * 1~10까지 홀수 합 구하기
    * 단, continue 사용
    */

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			/* if(i%2 ==1)
				sum +=i
				*/
			if (i%2 == 0)
				continue; //이조건을 만족하면 i++로 올라감
			sum += i;  //sum = sum +i;
		 
		}
		System.out.println(sum);
	}

}
