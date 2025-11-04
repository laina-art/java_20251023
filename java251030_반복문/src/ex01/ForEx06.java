package ex01;

public class ForEx06 {
	 public static void main(String[] args) {
	        /*
	         * 2~5단 까지 구구단 출력
	         * 2x1=2
	         * 2x2=4
	         * ...
	         * 3x1=3
	         * ...
	         * 4x9=36
	         * 2단은 2개 ,3단은 3개, 4단은 4개....
	         */
          
		 for (int i=2; i<=5; i++) {
			 for(int j=1; j<=9; j++) { //j를 9번 반복하겠다는 뜻
				 
				 System.out.println(i+"x" +j+"=" + i*j);
				 
				 if(i == j) break; //j++로 감
				 
			 }
			 System.out.println("---------------"); //j++로 올라감
		 }
	 }
}
