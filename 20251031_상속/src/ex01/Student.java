package ex01;
//student 클래스는 Person의 클래스 상속
public class Student extends Person{
	
	//private 정보은닉 멤버변수는 외부 노출시키지 않는다.
	private String school;
    
	
	public Student(){} //디폴트 생성자
	public Student(String name, int age,String school){
		super(name, age);
		this.school = school;
	System.out.println("Student class");
	}
	public void study() {
	System.out.println(school + "에서 공부 중입니다.");
	}
    
	
}
