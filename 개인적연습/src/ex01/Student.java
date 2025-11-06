package ex01;
/*
필드: major(전공)
생성자: Student(String name, int age,
String major)
👉 이 생성자 안에서 super(name, age)로 부모 생성자 호출
 */

  class Student extends Person {

   private String major;

   public Student(String name,int age,String major) {
         super(name,age);
         this.major = major;
   }
   @Override
   public void showInfo() {
	   super.showInfo();
	   System.out.printf("전공: %d");



	  }

  }