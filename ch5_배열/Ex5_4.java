import java.util.Arrays;

// 배열의 활용 3 - 섞기
// 난수 발생 시켜서 난수 자리와 맨첫번째자리 계속 교체하기
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
