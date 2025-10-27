package ex01;

public class BreakExample {

	public static void main(String[] args) {
	
		while(true) {
			int num =(int)(Math.random()*6) +1; //1~6사이의 정수 랜더하게 변수 저장
			System.out.println(num);
			
			if(num ==6)
				  break;
	    }
		System.out.println("프로그램 종료!");
		
		
	}

}
