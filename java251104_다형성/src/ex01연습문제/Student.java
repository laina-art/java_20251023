package ex01연습문제;

public class Student extends Person {
	private String schoolName;		
	
	public Student() {}
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
    public void showStudentInfo() {
    	super.showInfo(); //상위 메소드 호출
    	System.out.printf("학교: %s\n", schoolName  );
}
	}