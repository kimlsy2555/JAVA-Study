package example02;

// �ڼ� Ŭ����
public class Defender extends Player {

	private int def;

	public Defender(String name, int age, int backNumber, int speed, int def) {
		super(name, age, backNumber, speed); // player ������
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
	
	@Override
	public void info() {
	
		super.info(); // player �� info�� ȣ��
		System.out.println("�н� ���� : " + this.getDef()); 
	}
}
