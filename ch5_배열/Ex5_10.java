// 과목 평균 계산
public class Ex5_10 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
			};
		
		int korTotal =0, engTotal =0, mathTotal=0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("====================");
		
		for(int i=0; i<score.length; i++) {
			int total = 0;
			float average = 0f;
			
			for(int j=0; j<score[i].length; j++) {
				total += score[i][j];
			}
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			average = total / (float)score[i].length;
			System.out.println((i+1)+" "+score[i][0]+" "+score[i][1]+" "+score[i][2]+" "+total+" "+average);
		}
		System.out.println(korTotal+" "+engTotal+" "+mathTotal);
	}

}
