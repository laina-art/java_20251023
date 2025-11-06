package ex02;

public class Car extends Vehicle {
     private String type;

     public Car() {}
 	 public Car(String brand, int year, String type) {
 	     super(brand,year);
 	     this.type = type;
	 }
 	 private void showInfo() {
 		super.showInfo();
 		System.out.printf("브랜드: %s,연식: %d",brand, year");
     }
}
