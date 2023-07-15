// 커맨드 라인을 통해 입력 받기, 윈도우에서는 커맨드 창에서 쓸 수 있음
public class Ex5_8 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+args[i]+"\"");
		}

	}

}

// 소스파일 위치, alt + enter
// args.length - 들어온 입력 개수
// args[] - 입력 내용
