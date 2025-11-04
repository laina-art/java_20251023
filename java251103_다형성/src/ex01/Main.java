package ex01;

public class Main {
	/* Person 클래스 만들고 private 접근범위 name, age 필드를 가진다
	showinfo() 메서드에서 이름과 나이를 출력한다
	Student 클래스를 Person을 상속받아 schoolName 필드를 추가하고
	showStudentinfo() 메서드에서 학교이름까지 출력한다

	출력예시
	이름 : 홍길동, 나이:20
	학교 천호중학교
	*/

	public static void main(String[] args) {
		
		Student s1 = new Student("천호중학교");		
		s1.study();
		System.out.println(s1.info());
		System.out.println("----------------------");
		
		Student s2 = new Student("홍길동", 25, "천호중학교");
		s2.study();
		System.out.println(s2.info());
	}
}
