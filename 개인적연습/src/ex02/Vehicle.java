package ex02;

public class Vehicle {
	 private String brand;
	 private int year;

	 public Vehicle() {}
	 public Vehicle(String brand, int year) {
	     this.brand = brand;
	     this.year = year;
	 }

	private void showInfo() {
		System.out.printf("브랜드: %s,연식: %d\n",brand, year);


	}

}
