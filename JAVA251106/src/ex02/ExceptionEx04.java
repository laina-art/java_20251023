package ex02;

public class ExceptionEx04 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		int a = 5;
		int b = 2;
		int c = 0;
		int[] num = new int[5];
		String str = null;


        try {
    		System.out.println(num[4]);
    		System.out.println(str.length());

    		c = a/b;

        }catch(Exception e) {
        	System.out.println("예외가 발생했습니다!");
        	System.out.println(e);
     	}finally { //finally는 예외가 발생안하든 하든 무조건 실행됨
			System.out.println("c: " + c);
     	}

        System.out.println("프로그램 종료...");
	    }
}
