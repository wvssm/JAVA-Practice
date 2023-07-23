class MyPoint3 {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+"y:"+y;
	}
}

class MyPoint3D extends MyPoint3{
	int z;
	
	MyPoint3D (int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x:"+x+" y:"+y+" z:"+z;
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+" y:"+y;
	}
}
public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3D p =new MyPoint3D(3,5,7);
		System.out.println(p);
	}
}
