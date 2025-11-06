package 연습문제2;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() { //public 생성자
		 System.out.println("멍멍!");
    }
}
