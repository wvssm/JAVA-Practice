class Outer {
	private int outerIv = 0;
	static  int outerCv = 0;

	class InstanceInner {
		int iiv  = outerIv;  // 1. �ܺ� Ŭ������ private����� ���ٰ����ϴ�.
		int iiv2 = outerCv;
	}

	static class StaticInner {
// ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
//		int siv = outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;  // JDK1.8���� final ���� ����
		//lv = 3; // ���� �ٲ�� ������ ���̻� ����� ������ �� ���� 
		
		// �޼��庸�� ��ü�� �� ���� ��Ƴ��� �� ����. �׷��� �ٲ��� �ʴ� ������̶�� final�� ���̴� ������ ����.
		// �޼��尡 ����ǵ� ����� constant pool�̶�� ����� ���� �����ϴ� ���� ����, �׷��� �Ҹ� X
		
		class LocalInner { // 2. ���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��� ����
			int liv  = outerIv;
			int liv2 = outerCv;
//	�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.
			int liv3 = lv;	// ����!!!(JDK1.8���� ���� �ƴ�)
			int liv4 = LV;	// OK
		}
	}
}