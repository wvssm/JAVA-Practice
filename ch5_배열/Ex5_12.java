import java.util.Arrays;

// Array 클래스 사용하기
public class Ex5_12 {

	public static void main(String[] args) {
		int[] arr = {3,2,4,0,1}; // 1차원 배열 array
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 배열을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D)); // 2차원 배열 string으로 만들기
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D,str2D2)); // 2차원 배열 비교
		
		int[] arr2 = Arrays.copyOfRange(arr, 2, 3); // 배열 구간 지정 복사
		System.out.println(Arrays.toString(arr2));
	}

}
