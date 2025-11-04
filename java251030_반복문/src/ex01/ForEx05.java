package ex01;

public class ForEx05 {
	 public static void main(String[] args) {
	        
		 int sum = 0;
		 int i=0;
		 
		 for (i=1; i<=100; i++) {
			 
			 if(i % 2 == 0)
				 continue; //i++로 올라감, 홀수면 continue 수행하지 않고 sum으로 내려감
				 
				 
			 sum += i;
		 }
		 
		 System.out.printf("sum = %d\n", sum);
			
	 }
}
