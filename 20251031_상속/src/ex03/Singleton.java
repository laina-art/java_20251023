package ex03;
 /* 싱글톤 : 객체 생성을 	1개만 생성해서 공유*/
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	//여기서 private는 외부에서 바로들어오지않도록 붙인다
	
	private Singleton() { //외부에 객체 생성불가, 객체로만 만들어서 공유
			}
    
	//생성된 singleton 객체를 사용할수 있는 유일한 통로
	public static Singleton getInstance() { //싱글톤 반환할때 예시9번으로 감
		return singleton; // > 위의 객체를 받아온 값이고
	}
}
class Sample{
	public Sample(){
    }
	
	static void func() {
		 System.out.println("func()...");
	}
}