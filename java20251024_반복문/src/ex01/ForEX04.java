package ex01;

public class ForEX04 {

	public static void main(String[] args) {
	
			/*
		 * 중첩 for 문 - 구구단출력 - 2단 출력
		 * 2x1 =2
		 * 2x2=4
		 * 2x3=6
		 * ....
		 * 2x9 = 18
		 * 틀릴때까지 반복
		 */
		
        for(int i=2; i<=5; i++) {
        System.out.println("--------------------"+i+"단--------------------");	
        for (int j=1; j<=9; j++)
			
		System.out.println(i+"X "+ j + " = " + i*j);

	   }
	}
}
