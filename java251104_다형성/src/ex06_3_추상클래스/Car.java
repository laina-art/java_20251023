package ex06_3_추상클래스;

abstract public class Car {
	public void move() { //굳이 재정의 필요하지 않음
		 System.out.println("차를 이동합니다.");
	}
	//car클래스를 상속하는 클래스는 fillup메소드를 반드시 재정의 하세요!
	public abstract void fillUp(); 
	    
}
