package ex01;

public class ForEX03 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i =1;
		
		/*
		 * 1~100까지 짝수 합
		 */
		
		//for(; i<=100 ;) {
		for(;i<=100;) {
			if(i % 2 == 0) //홀수는 ==1
	        sum += i++;
			
			//i++;
		}
		
		System.out.println("합 : " + sum);

	}

}
