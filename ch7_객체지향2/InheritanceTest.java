class MyPoint {
	int x;
	int y;
}

class Circle{
	MyPoint p = new MyPoint(); // 참조변수 선언만 하면 안되고 초기화도 함께 해줘야함
	int r;
}
//class Circle extends MyPoint {
//	int r;
//}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.x="+c.p.x);
		System.out.println("c.y="+c.p.y);
		System.out.println("c.r="+c.r);

	}

}
