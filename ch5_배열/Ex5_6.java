// String Array ����ϱ�
public class Ex5_6 {
	public static void main(String[] args) {
		String[] arr = {"����", "����", "��"};
		
		int n=0;
		for(int i=0; i<10; i++) {
			n = (int)(Math.random()*3);
			System.out.println(arr[n]);
		}
	}
}
