package ex01;

public class ClassEx01 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "이송아";
	    s1.age = 35;
		s1.address = "강동구 천호동";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		
		System.out.println("---------------");
		
		Student s2 = new Student();
		s2.name = "선아영";
		s2.age = 28;
		s2.name = "강동구 암사동";
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.address);
		s2.study();
      }
	}
/*
 * 클래스 - 멤버변수(속성), 멤버 매소드(함수)
 * 멤버변수 - 점적(상태), 맴버매소드-동적(행동)
 */
class Student{
	String name;
	int age;
	String address;
	
	void study() {
		 System.out.println(name + "JAVA 공부 중 입니다");
		 
	}
}
	