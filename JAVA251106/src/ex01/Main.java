package ex01;

public class Main {

	public static void main(String[] args) {
		Shape s = new Circle(10, 20);
    	s.draw();
    	s = new Rectangle(30,40);
    	s.draw();
    	s = new Shape(0,0);
    	s.draw();

	}

}
