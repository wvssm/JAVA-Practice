class AAA { // AAA�� BBB�� �ܺ� Ŭ����
	int i=100;
	BBB b = new BBB();
	
	class BBB { // BBB��  AAA�� ���� Ŭ���� 
		void method() {
//			AAA a = new AAA(); 
//			System.out.println(a.i);
			System.out.println(i); // ��ü �������� �ܺ� Ŭ������ ��� ���ٰ���
		}
	}
}


//class BBB {
//	void method() {
//		AAA a = new AAA();
//		System.out.println(a.i);
//	}
//}

class CCC {
//	BBB b = new BBB(); // AAA�� ���ο� �����Ƿ� ���������� �����Ұ�
	// AAA�� �����ϰ� ���� ������ �� ����, BŬ������ AŬ������ ���ó�� �ٷ����� ����
}

public class InnerTest {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
	}
}
