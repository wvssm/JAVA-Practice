import java.util.Arrays;

// Array Ŭ���� ����ϱ�
public class Ex5_12 {

	public static void main(String[] args) {
		int[] arr = {3,2,4,0,1}; // 1���� �迭 array
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // �迭�� ������������ ����
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D)); // 2���� �迭 string���� �����
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D,str2D2)); // 2���� �迭 ��
		
		int[] arr2 = Arrays.copyOfRange(arr, 2, 3); // �迭 ���� ���� ����
		System.out.println(Arrays.toString(arr2));
	}

}
