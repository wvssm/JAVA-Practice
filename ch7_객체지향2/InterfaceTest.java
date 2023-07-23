class A {
	public void method(B b) {
		b.method();
	}
}

class B{
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class Ai {
	public void method(I i) {
		i.method();
	}
}

interface I {
	void method(); // �������̽��̱� ������ ���� �����ϴ� ���� �ƴϴ�.
}

class Bi implements I {
	public void method() {
		System.out.println("�������̽��� ����� BŬ������ �޼���");
	}
}

class Ci implements I {
	public void method() {
		System.out.println("�������̽��� ����� CŬ������ �޼���");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A�� B�� ��� (����)
		// ���θ� C�� �ٲٷ��� ���⵵ ����,CŬ���� ����, A�޼��嵵 �����ؾ��Ѵ� 
		
		Ai ai = new Ai();
		ai.method(new Ci()); //ai.method(new I()); <-�̰� �̷��� ���°� �ƴ϶�
		// I �������̽��� ������ Ŭ������ ��ü���� �־��ָ� ��, ex.Bi
		// ���θ� C�� �����Ϸ��� �����, ���ο� CŬ������ �������ָ� �ȴ�.
	}
}

// ����Ʈ����� �Ǽ��� ���̷��� ������ �ּ�ȭ�϶�
