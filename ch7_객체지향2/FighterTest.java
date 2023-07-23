abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�.");}
}

interface Fightable { // �������̽��� ��� �޼���� public abstract. ���� ����
	void move(int x, int y); // public abstract ����
	void attack(Fightable f); // public abstract ����
 }

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) { // public �� ���� ���� ��
		// �������̵� ��Ģ: ���󺸴� ���� �����ڰ� ������ �ȵȴ�. public ���ϸ� �������°� ���⿡ �ɸ� 
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
		}
	
	public String toString () {
		return "Fighter";
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}
public class FighterTest {

	public static void main(String[] args) {
		Fighter f2 = new Fighter();
		Fightable ff = f2.getFightable();
		
		Unit2 u = new Fighter();
		Fightable f = new Fighter();
		
		u.move(100, 200);
//		u.attack(new Fighter()); // Unit���� ���� �޼���
		u.stop();

		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); // Fightable���� ���� �޼���

	}
	// �������̽��� ���� �����ϰ� �Ϲ� �������� ���� ���� 

}
