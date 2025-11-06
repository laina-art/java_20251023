package ex01;

public class Shape {
	   private int x;
	   private int y;

	   public Shape() {}
	   public Shape(int x, int y) {
		   this.x = x;
		   this.y = y;
	   }
	   public int getX(){ return x;}
	   public int getY(){ return y;}

	   public void draw() {;
	   //System.out.println("도형을 ("+ x +","+ y+")에 그립니다.");
	   System.out.printf("도형을 (%d,%d)에 그립니다.\n",x,y);

	   }
}
