// String Ŭ���� �żҵ� ����ϱ�
public class Ex5_7 {

	public static void main(String[] args) {
		String string = "ABCDE";
		
		char ch = string.charAt(2);
		System.out.println(ch); // C
		
		String str2 = string.substring(1,4);
		String str3 = string.substring(1,string.length());
		String str4 = string.substring(1); // str3�� ����
		System.out.println(str2); // BCD
		System.out.println(str3); // BCDE
	}

}
