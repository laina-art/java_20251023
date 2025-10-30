package ex11;

public class StaticEx01Main {

	public static void main(String[] args) {
	/*instance 개별적인 것은 자체적으로만 가지고 있고
		static은 공유해서 하나바꾸면 다 영향받음
		instance에 있는걸 static에 대입할수 없음
		static은 static 붙어있는 것 끼리만 사용가능
		*/	
	System.out.println(StaticEx01.ban);
	StaticEx01.test(); //ban=0 나옴
	
	StaticEx01 s1 = new StaticEx01();
	StaticEx01 s2 = new StaticEx01();
	
	System.out.println(s1.ban);
	s1.ban = 10;
	
	System.out.println(s2.ban);
	System.out.println(s1.ban);
	
	s1.number=100;
	s1.func();
	
	s2.func();
	}

}
