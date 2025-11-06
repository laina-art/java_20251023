package ex02;

public class ExceptionEx01 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		int a = 5;
		int b = 2;  //0넣으면 오류남 오류안나게 하려면 하단의 기록 참고할것

		/*if(b>0) {
		int c = a/b;
		System.out.println(c);
		}*/
        try { //try	ㅡㄹ럭에는 에외가 발생할 개연성이 있는 코드를 넣어준다

        	int c = a/b;
    		System.out.println(c);

    		int[] num = new int[5];
    		System.out.println(num[3]);

    		String str = null;
    		System.out.println(str.length());

        }catch(ArithmeticException e) { //Arithmetic 에러와 관련이 있는 내용을 찾는다 e로 진입
		   	System.out.println("0으로 나누면 에러 발생...");
		   	//System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("배열 크기를 벗어났습니다...");
        }catch(NullPointerException e) {
        	System.out.println("null값은 출력되지 않습니다!...");
     	}
        System.out.println("프로그램 종료...");
	    }
}
