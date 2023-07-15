import java.util.Arrays; // ctrl + shift + O import 필요할 때

public class Ex5_1 {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
	}
}
