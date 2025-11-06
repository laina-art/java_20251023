package ex02;

public class ExceptionEx03 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		int a = 5;
		int b = 2;


        try {
        	int c = a/b;
    		System.out.println(c);

    		int[] num = new int[5];
    		System.out.println(num[3]);

    		String str = null;
    		System.out.println(str.length());

        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("배열 크기를 벗어났습니다...");
        }catch(Exception e) {
        	System.out.println("null값은 출력되지 않습니다!...");
     	}
        System.out.println("프로그램 종료...");
	    }
}
