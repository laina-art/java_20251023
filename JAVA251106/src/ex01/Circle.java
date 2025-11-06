package ex01;

class Circle extends Shape {

	public Circle(int x, int y) {
		super(x,y);
	}
	@Override
	public void draw() {
		System.out.printf("원을 (%d,%d)에 그립니다.\n", getX(), getY());
	}
}
