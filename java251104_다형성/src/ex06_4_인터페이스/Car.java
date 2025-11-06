package ex06_4_인터페이스;

import javax.swing.text.TabStop;

public interface Car {
	
	void move(); 
	
	default void stop() {  //처음부터 고려하면 안됨.부득이한 유지보수에만!
		System.out.println("----------");
	}; //구현해도 되고 안해도되고
	
	public abstract void fillUp(); 
}
