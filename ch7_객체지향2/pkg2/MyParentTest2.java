package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent{
	public void printMmbers() {
//		System.out.println(prv); // ����: ���� Ŭ����X
//		System.out.println(dft); // ����: ���� ��Ű��X
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); //���� - ���� Ŭ����X
		//System.out.println(p.dft); //���� - ���� ��Ű��X
		//System.out.println(p.prt); //���� - �ڼ� ��Ű��X
		System.out.println(p.pub);

	}

}
