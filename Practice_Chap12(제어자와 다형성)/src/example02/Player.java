package example02;

public class Player {

	//��� ���� 
	private String name;
	private int age;
	private int backNumber;
	private int speed;
	
	//������
	
	public Player(String name, int age, int backNumber, int speed) {

		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.speed = speed;
		
	}
	
	// getter �޼��� ����
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public int getSpeed() {
		return speed;
	}
	
	
	public void info() {
		
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getAge());
		System.out.println("��ȣ : " + this.getBackNumber());
		System.out.println("�ӵ� : " + this.getSpeed());
		
	}
	
	
	
	
}
