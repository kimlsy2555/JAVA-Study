package example02;

// �ڼ� Ŭ����
public class MidFielder extends Player {

	private int pass;

	public MidFielder(String name, int age, int backNumber, int speed, int pass) {
		super(name, age, backNumber, speed); // player ������
		this.pass = pass;
	}
	
	public int getPass() {
		return this.pass;
	}
	
	@Override
	public void info() {
	
		super.info(); // player �� info�� ȣ��
		System.out.println("��ȿ �н� : " + this.getPass()); 
	}
}
