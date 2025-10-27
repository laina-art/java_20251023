package ex01;

public class WhileEX04 {

	public static void main(String[] args) {

	      /*
	      int sum=0;
	      
	      for(int i=1; i<=5;  i++) {
	         sum += i;
	      }
	      */
		
		int sum = 0;
		int i = 1 ;
		
	while(i<5)
	    sum += i++;
	   
		System.out.println("합 : " + sum);
		//비추방법
	}
 }