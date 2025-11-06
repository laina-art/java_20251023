package ex05;
  //inf learn 김영한강의 들어보기
import java.util.function.Function;

public class PayMain {

	public static void main(String[] args) {
		
     CrediCard cr = new CrediCard();
     cr.fare(10000);
     System.out.println("----------------");

     SamsungPay sa = new SamsungPay();
     sa.charge(10000);
     System.out.println("----------------");
     
     Payment p = new KakaoPay();
     p.pay(50000);
     
     func(new CrediCard(),5000);
     
	}
	public static void func(Payment p, int money) {
		p.pay(money);
	}
}
