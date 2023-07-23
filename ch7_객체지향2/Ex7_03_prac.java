class Product20 {
	int price;			// ��ǰ�� ����
	int bonusPoint;	// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product20(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	Product20() {} // �⺻ ������
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

class Buyer20 {			  // ��, ������ ��� ���
	int money = 1000;
	int bonousPoint = 0;
	Product20 [] cart = new Product20[10];
	int i = 0;
	
	void buy(Product20 p) {
		this.money -= p.price;
		this.bonousPoint += p.bonusPoint;
		cart[i++] = p;
	}
// �� �������� ��ӵ˴ϴ�.
	void summary() {	              // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;                 // ������ ��ǰ�� �����հ�
		String itemList ="";         // ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<cart.length;i++) {
			if(cart[i]== null) break; // NULL�� �ƴ϶� null�̶� ����� �˾Ƶ���
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
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
