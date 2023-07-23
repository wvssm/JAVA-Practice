class A {
	public void method(B b) {
		b.method();
	}
}

class B{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class Ai {
	public void method(I i) {
		i.method();
	}
}

interface I {
	void method(); // 인터페이스이기 때문에 따로 구현하는 것이 아니다.
}

class Bi implements I {
	public void method() {
		System.out.println("인터페이스를 사용한 B클래스의 메서드");
	}
}

class Ci implements I {
	public void method() {
		System.out.println("인터페이스를 사용한 C클래스의 메서드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A가 B를 사용 (의존)
		// 내부를 C로 바꾸려면 여기도 수정,C클래스 생성, A메서드도 수정해야한다 
		
		Ai ai = new Ai();
		ai.method(new Ci()); //ai.method(new I()); <-이건 이렇게 적는게 아니라
		// I 인터페이스를 구현한 클래스의 객체들을 넣어주면 됨, ex.Bi
		// 내부를 C로 변경하려면 여기랑, 새로운 C클래스를 생성해주면 된다.
	}
}

// 소프트웨어에서 실수를 줄이려면 변경을 최소화하라
