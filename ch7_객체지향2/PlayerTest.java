abstract class Player{ //�߻� Ŭ���� (�̿ϼ� Ŭ����, �̿ϼ� ���赵)
	abstract void play(int pos); // �߻� �޼���
	abstract void stop(); // �߻� �޼���(����θ� �ְ� ������{ }�� ���� �޼���
}
// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos+"��ġ���� play�մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player(); // �߻� Ŭ������ ��ü ���� �Ұ�
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}

}
