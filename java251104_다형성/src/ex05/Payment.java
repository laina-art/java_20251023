package ex05;
//인터페이스 가져다쓸땐 무조건 public qnxdudigka
public interface Payment {
	
	public void pay(int amount); //public 생략	
}

class CrediCard implements Payment{
	void fare(int amount) { //교통요금
		System.out.printf("신용카드로 %d 결제했습니다.\n", amount);
	}

	@Override
	public void pay(int amount) { //추상메서드 구현
		System.out.printf("신용카드로 %d 결제했습니다.\n", amount);
		
	}
}

class KakaoPay implements Payment{
	void fee(int amount) { //서비스요금
		System.out.printf("카카오페이로 %d 결제했습니다.\n", amount);
	}
	
	@Override
	public void pay(int acount) {
		System.out.printf("카카오페이로 %d 결제했습니다.\n", acount);
	}
}

class SamsungPay implements Payment{
	void charge(int amount) { //일반 요금
		System.out.printf("삼성페이로 %d 결제했습니다.\n", amount);
	}
	
	@Override
	public void pay(int acount) {
		System.out.printf("삼성페이로 %d 결제했습니다.\n", acount);
   }
}