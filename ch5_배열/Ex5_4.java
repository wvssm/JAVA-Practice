import java.util.Arrays;

// �迭�� Ȱ�� 3 - ����
// ���� �߻� ���Ѽ� ���� �ڸ��� ��ù��°�ڸ� ��� ��ü�ϱ�
public class Ex5_4 {

	public static void main(String[] args) {
		int[] arr= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));

		int n, temp = 0;
		
		for(int i=0; i<100; i++) {
			n = (int)(Math.random()*10);
			temp = arr[0];
			arr[0] = arr[n];
			arr[n] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
