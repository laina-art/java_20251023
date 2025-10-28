package ex05;

public class 입력X출력X{

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "이송아";
	    s1.age = 35;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
				
		s1.info();
		
		
		System.out.println("---------------");
		
		Student s2 = new Student();
		s2.name = "선아영";
		s2.age = 28;
		s2.address = "강동구 암사동";
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.address);
		s2.study();
		
		s2.info();
			
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
	
	//함수명 : add, 반환타입(리턴값):int 매개변수(입력값) int 2개
	void info() {
		
		System.out.println(name + "님 나이는 " + age + "이고, " + address + "살고 있습니다.");
	}
}
	