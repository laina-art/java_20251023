package ex10;

import java.util.Scanner;
import ex08.Print;

public class PrintMain {

	public static void main(String[] args) {
		
				
		//Math.random(); >>정적메소드
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5,7);
		Printer.println("홍길동");
		
		Printer.println(10, 20);
		
        Printer p = new Printer();
        p.println(1000);
        
        Printer.println(10);
        
        Printer p2 = new Printer();
        p2.print();
	}

}
