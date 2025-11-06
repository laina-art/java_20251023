package ex01;

public class Rectangle extends Shape {

	public Rectangle(int x, int y) {
		  super(x,y);
	}

	@Override
	public void draw() {
		System.out.printf("사각형을 (%d,%d)에 그립니다.\n", getX(), getY());
    }
}