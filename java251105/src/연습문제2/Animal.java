package 연습문제2;

public class Animal {
	//class 앞에 abstract 붙여서 명확해짐 
	
	private String name;
	private int age;
	
	public Animal() {}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	public void makeSound() {        
	    System.out.println("동물이 소리를 냅니다");
	}
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d살\n",name,age);
  }
}