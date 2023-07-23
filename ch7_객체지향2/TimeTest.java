class Time {
	private int hour; // 0~23
	private int minute; // 0~59
	private int second; // 0~59
	
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return !(0<=hour&&hour<=23);
	} // 내부에서만 쓰는 메소드를 public으로 할 일이 없음(클래스 안에서만 테스트 하면 됨)
	// 배포전 테스트할 때 class의 내부, 안에서만 점검하면 됨
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25; // private라서 직접 접근 불가
		t.setHour(15);
		t.setHour(88);
		System.out.println(t.getHour());

	}

}
