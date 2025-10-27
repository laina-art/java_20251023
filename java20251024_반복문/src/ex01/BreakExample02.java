package ex01;

     /* 1부터 ?
      * 이떄 총합이 10000이상 되는 순간 값찾기
      */
public class BreakExample02 {

	public static void main(String[] args) {
	
				
			int sum = 0;
			int i =0;
			
			while(true) {
				i++;
				sum += i;
				if(sum>=10000) {
					break;
				}
	      	}
		System.out.println("총합 : "+ sum + "i : " +i);
		System.out.println("프로그램 종료!");
				
	}
}

