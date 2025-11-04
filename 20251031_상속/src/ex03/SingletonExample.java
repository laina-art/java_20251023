package ex03;

public class SingletonExample {

	public static void main(String[] args) {
		/* Singleton s = new Singleton();
		s.  이거 못씀 외부 클래스라서 sington에서 미리 객체선언하고
				 객체 선언 없이 가져다 쓸수있게 static 사용
				 > 왜나하면 static은 자기들끼리만 사용이 가능해서*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		Sample sam1 = new Sample(); //하나의 싱글톤 객체공유
		Sample sam2 = new Sample();
		
		if(sam1.equals(sam2)) {
			System.out.println("같은 Sample 객체입니다.");
		}else {
			System.out.println("다른 Sample 객체입니다.");
		}
		//Sample.func();
		Singleton s1 = Singleton.getInstance();

		System.out.println(s1);
		
	}

}
