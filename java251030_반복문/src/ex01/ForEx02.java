package ex01;

public class ForEx02 {
	 public static void main(String[] args) {
	        /*
	         * 2~5단 까지 구구단 출력
	         * 2x1=2
	         * 2x2=4
	         * ...
	         * 3x1=3
	         * ...
	         * 4x9=36
	         */
          
		 for (int i=2; i<=5; i++) {
			 for(int j=1; j<=9; j++) { //j를 9번 반복하겠다는 뜻
				 System.out.println(i+"x" +j+"=" + i*j);
			 }
			 System.out.println("---------------"); //j++로 올라감
		 }
	 }
}
