package pkg1;

public class MyParent { // public Ŭ������ �ҽ����� �� �ϳ�
	// �ҽ����� �̸��� public Ŭ������ �̸��� ���ƾ��Ѵ�**
	private	  int prv; // ���� Ŭ����
			  int dft; // ���� ��Ű��
	protected int prt; // ���� ��Ű�� + �ٸ� ��Ű��(�ڼ�) 
	public    int pub; // ���� ���� ����
	
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
		//System.out.println(p.prv); //���� - ���� Ŭ����X
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
