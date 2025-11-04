package ex01;

import javax.sound.midi.SysexMessage;

public class Main {

	/* 상위클래스는 하위클래스를 참조가능
	 * 그러나 접근 영역은 상위클래스 영역으로 한정
	 * 만약, 하위 클래스 영역을 접근하려면 그 메소드가 상위클래스 메소드를 오버라이딩하면 가능
	 * 
	 *  하위클래스는 상위클래스 참조 불가
	 *  
	 */
	 public static void main(String[] args) {
	
     AClass a1 = new AClass();
     a1.fA();
     System.out.println(a1.toString());
     System.out.println("--------------");
     
     AClass a2 = new BClass();
     a2.fA();
     System.out.println(a2.toString());
     System.out.println("---------------");
     
     BClass b1= new BClass();
     b1.fA();
     b1.fB();
     System.out.println(b1.toString());
     
     System.out.println("---------------");
     
     BClass b2= (BClass)a2;
     b2.fA();
     b2.fB();
     System.out.println(b2.toString());
    
}
	
}
