
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10.0/3);
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);
//		System.out.printf("%#x%n", 15);
//		System.out.printf("%s",Integer.toBinaryString(15));
		
//		double f = 123.456789;
//		System.out.printf("%f%n", f);
//		System.out.printf("%e%n", f);
		System.out.printf("[%5d]%n", 1234567); // [1234567]
		System.out.printf("[%-5d]%n", 10); // [10   ]
		System.out.printf("[%05d]%n", 10); // [00010]
		
		double d = 1.23456789;
		System.out.printf("%14.6f%n", d); //       1.234568
		// 보이는 것만 반올림되어 출력되지 실제 값은 반올림 안한 상태로 저장됨
		System.out.printf("[%s]%n", "www.codechobo.com"); // [www.codechobo.com]
		System.out.printf("[%20s]%n", "www.codechobo.com"); // [   www.codechobo.com]
		System.out.printf("[%-20s]%n", "www.codechobo.com"); // 왼쪽 정렬 [www.codechobo.com   ]
		System.out.printf("[%.10s]%n", "www.codechobo.com"); // 앞에서 10자리만 출력 [www.codech]
	}

}
