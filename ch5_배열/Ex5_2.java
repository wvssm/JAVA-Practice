// �迭�� Ȱ�� 1 - ���
public class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] arr = {100, 88, 100, 100, 90};
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		average = (float)sum/arr.length;
		
		System.out.println("�迭�� ����:"+sum);
		System.out.println("�迭�� ���:"+average);
	}
}
