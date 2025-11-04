package ex02;

public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		Student s1 = new Student();
		Person p1 = new Person();
		
         //다형성 : 상위 클래스는 하위 클래스 참조가능
		Person p2 = new Person();
		p2.pInfo();
		
		Person p3 = new Teacher();
		p3.pInfo();
		//p3.tInfo() //주석풀면 에러
		p3.func();
		
		System.out.println("------------------------");
		
		Teacher t2 = (Teacher)p3;
		t2.pInfo();
		t2.tInfo();
		t2.func();
		
		Person p4 = new Student();

	}

}
