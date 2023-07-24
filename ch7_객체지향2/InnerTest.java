class AAA { // AAA는 BBB의 외부 클래스
	int i=100;
	BBB b = new BBB();
	
	class BBB { // BBB는  AAA의 내부 클래스 
		void method() {
//			AAA a = new AAA(); 
//			System.out.println(a.i);
			System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근가능
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
//	BBB b = new BBB(); // AAA의 내부에 있으므로 독립적으로 생성불가
	// AAA를 생성하고 나서 생성할 수 있음, B클래스는 A클래스의 멤버처럼 다뤄지고 있음
}

public class InnerTest {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
	}
}
