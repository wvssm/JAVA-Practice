class Product20 {
	int price;			// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수

	Product20(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	Product20() {} // 기본 생성자
}

class Tv20 extends Product20 {
	Tv20() {  super(100);	 }

	public String toString() { return "Tv"; }
}

class Computer20 extends Product20 {
	Computer20() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio20 extends Product20 {
	Audio20() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer20 {			  // 고객, 물건을 사는 사람
	int money = 1000;
	int bonousPoint = 0;
	Product20 [] cart = new Product20[10];
	int i = 0;
	
	void buy(Product20 p) {
		this.money -= p.price;
		this.bonousPoint += p.bonusPoint;
		cart[i++] = p;
	}
// 뒷 페이지에 계속됩니다.
	void summary() {	              // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;                 // 구입한 물품의 가격합계
		String itemList ="";         // 구입한 물품목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length;i++) {
			if(cart[i]== null) break; // NULL이 아니라 null이라 적어야 알아들음
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ex7_03_prac {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();

	}

}
