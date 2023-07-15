// String Array 사용하기
public class Ex5_6 {
	public static void main(String[] args) {
		String[] arr = {"가위", "바위", "보"};
		
		int n=0;
		for(int i=0; i<10; i++) {
			n = (int)(Math.random()*3);
			System.out.println(arr[n]);
		}
	}
}
