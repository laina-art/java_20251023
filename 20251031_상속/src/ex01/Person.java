package ex01;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
		
	public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Person class");
}
	
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	public void eat() {
		System.out.println(name + "은 점심을 먹는다");
	}
	
	@Override //안전장치, 점검장치
	//마우스 오른쪽>source>tostring
	//상위클래스에서 메소드 가져와서 재정의 했는지 확인
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}