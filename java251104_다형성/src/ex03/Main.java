package ex03;

public class Main {

	public static void main(String[] args) {
		
		Archer a = new Archer();
		a.attack();
		a.depend();
		System.out.println("---------------");
		
		Warrior w = new Warrior();
		w.attack();
		w.depend();
		System.out.println("---------------");
	
		Action f = new Archer();
	    f.attack();
	    f.depend();

	}
}
