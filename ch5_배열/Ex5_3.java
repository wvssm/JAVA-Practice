// 배열의 활용 2 - 최댓값, 최솟값
public class Ex5_3 {
	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		
		int min = score[0];
		int max = score[0];
		
		for(int i=0; i<score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
			if(max< score[i]) {
				max = score[i];
			}
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
	}
}
