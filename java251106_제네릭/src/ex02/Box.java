package ex02;

public class Box<Toy> {
	Toy item;
	void setItem(Toy item) {
		this.item = item;
	}
	Toy getItem() {
		return item;
	}
}
/*
 * public class Box<Car> {
	Car item;
	void setItem(Car item) {
		this.item = item;
	}
	Car getitem() {
		return item;
	}
}
- 이 Box상자에는 String만 넣을수 있다
public class Box<T> {
     String item;

     void setItem(String item) {
            this.item = item;
     }

     String getItem() {
          return item;
         }
     }
*/