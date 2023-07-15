// 로또 번호 추출기 (1~45)
public class Ex5_5 {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		int n, tmp = 0;
		
		for(int i=0; i<6; i++) {
			n = (int)(Math.random()*45);
			tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.println("lotto["+i+"]="+lotto[i]);
		}
	}
}
