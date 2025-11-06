package ex01;

public class BoxMain {

	public static void main(String[] args) {

          Box box = new Box();

          box.setItem(new Car());

          Object obj = box.getitem();
          Car car = (Car)box.getitem();
	}
}
class Car{
}
