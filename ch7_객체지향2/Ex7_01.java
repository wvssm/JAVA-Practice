
public class Ex7_01 {

	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c; // ����ȯ ���� ���� java.lang.ClassCastException
		fe.water();
		
		Car car = null;
		
		FireEngine fe2 = (FireEngine)car; // Null�̶� ����ȯ �Ǳ� ��  
		Car car2 = (Car)fe2; // Null
		//.drive(); // NullPointerException �߻�, ��ü�� �����ϱ�
		// ���� ��ü�� �߿� 
		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//
//		fe.water();
//		car = fe;    // car = (Car)fe;���� ����ȯ�� ������
////		car.water(); // ����. CarŸ���� ���������� car�δ� water()�� ���Ұ�
//		fe2 = (FireEngine)car; // �ڼ�Ÿ�� �� ����Ÿ��. ����ȯ ���� �Ұ�
//		fe2.water();

	}

} 

class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}