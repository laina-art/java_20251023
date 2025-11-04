package ex01;

public class DoWhile {
	 public static void main(String[] args) {
		 //조건자체가 거짓이면 한번도 실행안함
		 int sum = 0;
		 int i=0;
		 
		 do {
			 i++;
			 sum += i;
		 }while(i<5);
		 
		 System.out.println("총합 : " + sum);
	 }
}
