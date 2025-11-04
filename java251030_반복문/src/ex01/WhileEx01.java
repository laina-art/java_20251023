package ex01;

public class WhileEx01 {
	 public static void main(String[] args) {
		 
		 int sum = 0;
		 int i=0;
		 
		 
		 /*
		 for(int i=0; i<=10; i++) {
			   sum += i; //sum = sum + i
		 }
		 s=s+i
		 */
		 
	     while(i<5) {
	    	 i++;
	    	 sum += i;
	       }
	   /* 또는  while(i<=5) {
	    	 sum += i;
	    	 i++;
	     }
	     */
		 	   
		 System.out.println("총합 : " + sum);
	 }
}
