class Outer {
	private int outerIv = 0;
	static  int outerCv = 0;

	class InstanceInner {
		int iiv  = outerIv;  // 1. 외부 클래스의 private멤버도 접근가능하다.
		int iiv2 = outerCv;
	}

	static class StaticInner {
// 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;  // JDK1.8부터 final 생략 가능
		//lv = 3; // 값이 바뀌어 버리면 더이상 상수로 간주할 수 없음 
		
		// 메서드보다 객체가 더 오래 살아남을 수 있음. 그래서 바뀌지 않는 상수값이라면 final을 붙이는 습관을 갖자.
		// 메서드가 종료되도 상수는 constant pool이라고 상수를 따로 저장하는 곳이 존재, 그래서 소멸 X
		
		class LocalInner { // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능
			int liv  = outerIv;
			int liv2 = outerCv;
//	외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv;	// 에러!!!(JDK1.8부터 에러 아님)
			int liv4 = LV;	// OK
		}
	}
}