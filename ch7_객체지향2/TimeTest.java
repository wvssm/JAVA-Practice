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
	
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	private boolean isNotValidHour(int hour) {
		return !(0<=hour&&hour<=23);
	} // ���ο����� ���� �޼ҵ带 public���� �� ���� ����(Ŭ���� �ȿ����� �׽�Ʈ �ϸ� ��)
	// ������ �׽�Ʈ�� �� class�� ����, �ȿ����� �����ϸ� ��
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25; // private�� ���� ���� �Ұ�
		t.setHour(15);
		t.setHour(88);
		System.out.println(t.getHour());

	}

}
