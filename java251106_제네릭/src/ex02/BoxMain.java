package ex02;

public class BoxMain {

	public static void main(String[] args) {
		/*
		 *Car가 ㅡ이미하는 것은 Box 클래스가 있는 T가 Car란 것을 의미한다
		 *즉, t를 Car로 변경해서 컴파일시 Box.class 파일이 생성된다
		 *Box<Car> box = new Box<Car>();
		*/

          // Box<Car> box = new Box<Car>();

          //box.setItem(new Car());
          /*
           * box.setItem("new Car()"); 이 코드는 에러가 발생 이유는 box.setItem(Car car)이므로
           * car 클래스 객체만 전달가능
           * 하지만, 지금은 "new Car()"란 문자열을 전달하려고 시도했기 떄문에 에러가 발생
           * 즉, 타입이 일치하지 않기 떄문에.
           */

          //box.setItem{"new Car());"
          // Object obj = box.getitem();
          box.setItem(new Toy());

          Toy car = tbox.getItem();

          Box<Toy> tBox = new Box<>();
          tBox.setItem(new Toy());
          Toy toy = tBox.getItem();
	}
}

class Car{

}
class Toy{
}
