
public class Ex7_01 {

	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c; // 형변환 실행 에러 java.lang.ClassCastException
		fe.water();
		
		Car car = null;
		
		FireEngine fe2 = (FireEngine)car; // Null이라도 형변환 되긴 됨  
		Car car2 = (Car)fe2; // Null
		//.drive(); // NullPointerException 발생, 객체가 없으니까
		// 실제 객체가 중요 
		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//
//		fe.water();
//		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
////		car.water(); // 에러. Car타입의 참조변수인 car로는 water()를 사용불가
//		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
//		fe2.water();

	}

} 

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}