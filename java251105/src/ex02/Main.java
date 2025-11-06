package ex02;

public class Main {

	public static void main(String[] args) {

	  Printer p = new LaserPrinter();
	  p.print("테스트 페이지 출력");

	  System.out.println("------------------");

	  p = new InkjetPrinter();
	  p.print("테스트 페이지 출력");

	}
}
