package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent{
	public void printMmbers() {
//		System.out.println(prv); // 오류: 같은 클래스X
//		System.out.println(dft); // 오류: 같은 패키지X
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); //에러 - 같은 클래스X
		//System.out.println(p.dft); //에러 - 같은 패키지X
		//System.out.println(p.prt); //에러 - 자손 패키지X
		System.out.println(p.pub);

	}

}
