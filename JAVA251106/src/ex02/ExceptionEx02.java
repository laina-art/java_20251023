package ex02;

public class ExceptionEx02 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		int a = 5;
		int b = 0;  //0넣으면 오류남 오류안나게 하려면 하단의 기록 참고할것

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
        //exception만 써도 되는데 세분화 하면 어디서 에러가 발생했는지 알수있음
        }catch(Exception e) { //Arithmetic 에러와 관련이 있는 내용을 찾는다 e로 진입
		   	System.out.println("예외 에러 발생...");
		   	System.out.println(e);
        }
        System.out.println("프로그램 종료...");
	    }
}
