package ex01;

     /* 1부터 ?
      * 이떄 총합이 10000이상 되는 순간 값찾기
      */
public class BreakExample03 {

	public static void main(String[] args) {
		
		int sum =0;
		int i =0;
		
		while(i>10) {
			i++;
			
			if(i%2 == 0) //이조건을 만족하면 바로 다시 올라감, 만족하지않으면 {에서올라감 
				continue;
			
			sum += i; //sum = sum+i;
		}
	
		System.out.println(sum);
		System.out.println("프로그램 종료!");
				
	}
}

