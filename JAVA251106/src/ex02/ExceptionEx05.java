package ex02;

public class ExceptionEx05 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		func1(5,0);

		System.out.println("프로그램 종료...");
	    }

	private static void func1(int i, int j) throws ArithmeticException{ //여기 내에서만 사용

		func2(i,j);

	    System.out.println("예외발생...");
	}


	private static void func2(int i, int j) throws ArithmeticException{

		int result = i/j;
		System.out.println(result);

	}
}
