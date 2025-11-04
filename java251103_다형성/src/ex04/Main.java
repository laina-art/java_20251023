package ex04;

public class Main {

	public static void main(String[] args) {
        A a = new A(); 
        a.test(); // A
        
        a = new B();
        a.test(); // B
        
        a = new C();
        a.test(); // C
       
        a = new A(); 
       	a.test(); // A
        	
       	a = new B();
        a.test(); //B
        	
        a = new C();
        a.test(); //C

        
        //매소드 오버라이딩이 될 경우는, 참조변수가 가리키는 클래스 메소드가 호출
        
        a = new A();
        a.test(); //A class
       
        a = new B();
        a.test(); //B class
       
        a = new C();
        a.test(); //C class
        
        System.out.println("---------------");
        
        a = new B();
        // B b = new A();  x
        B b = (B)a;
        b.test();
        System.out.println("---------------");

        a = new C();
        C c = (C)a;
        c.test();
        
        System.out.println("---------------");

       A aa = null; 
       C cc = new C();
       aa= (A)cc;
       C cc1 = (C)aa;
       
       
	}
}
