package ex01;
     /*필드: name(이름), age(나이)
생성자: Person(String name, int age)
메서드: showInfo() → 이름과 나이 출력*/
public class Person {
     private String name;
     private int age;

          public Person(String name, int age) {;
          this.name = name;
          this.age = age;
     }

     public void showInfo() {
    	System.out.printf("이름: %s, 나이: %살\n,name,age");
    }
}