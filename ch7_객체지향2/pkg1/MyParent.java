package pkg1;

public class MyParent { // public 클래스는 소스파일 내 하나
	// 소스파일 이름과 public 클래스의 이름이 같아야한다**
	private	  int prv; // 같은 클래스
			  int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 다른 패키지(자손) 
	public    int pub; // 접근 제한 없음
	
	public void printMmbers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); //에러 - 같은 클래스X
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
