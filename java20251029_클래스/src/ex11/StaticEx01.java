package ex11;

public class StaticEx01 {
      
	int number;
	static int ban;
	
	void func() {
	    System.out.println("number : " + number);
	    }
	static void test() { //정적 메소드
		System.out.println("ban : " + ban);
		test2();
	}
	static void test2() {
		
	}
}
