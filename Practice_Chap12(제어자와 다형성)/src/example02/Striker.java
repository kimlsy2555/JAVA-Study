package example02;

// �ڼ� Ŭ����
public class Striker extends Player {

	private int shoot;

	public Striker(String name, int age, int backNumber, int speed, int shoot) {
		super(name, age, backNumber, speed); // player ������
		this.shoot = shoot;
	}
	
	public int getShoot() {
		return this.shoot;
	}
	
	@Override
	public void info() {
	
		super.info(); // player �� info�� ȣ��
		System.out.println("��ȿ ���� : " + this.getShoot()); 
	}
}
