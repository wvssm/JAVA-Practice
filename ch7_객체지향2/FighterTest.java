abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract. 예외 없이
	void move(int x, int y); // public abstract 생략
	void attack(Fightable f); // public abstract 생략
 }

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) { // public 안 쓰면 오류 뜸
		// 오버라이딩 규칙: 조상보다 접근 제어자가 좁으면 안된다. public 안하면 오류나는게 여기에 걸림 
		System.out.println("["+x+","+y+"]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
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
//		u.attack(new Fighter()); // Unit에는 없는 메서드
		u.stop();

		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); // Fightable에는 없는 메서드

	}
	// 인터페이스란 것을 제외하고 일반 다형성과 거의 동일 

}
