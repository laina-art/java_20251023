package ex01;

public class Student extends Person{

      private String school;
      
      public Student() {
          super(); //디폴트 생성자 자동기입
          }
     
      public Student(String school) {
    	  super(); //상위에 디폴트 생성자 안넣으면 오류남
          this.school = school;
      }
      
      public Student(String name, int age, String school) {
    	  super(name, age);//상위클래스 전달
    	  this.school = school;
      }
    
      public void study(){
     		System.out.println(getName() + "이 공부 중입니다.");
      }
}
