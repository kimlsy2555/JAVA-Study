package example04;

public class Car {

	
	int speed;
	
	public Car() {
		
	}
	
	public Car(int speed) {
		this.speed =speed;
		
	}
	//�޼��� �տ� ������  final �� ������ �ڼտ��� ��������� �� �� �� ����.
	//�޼��� �տ� final�� ���� ������ �޼��� ��� ���� ��
	public final void speedUp() {
		
		this.speed +=10;
		System.out.println("����  "+ this.speed + " �ӵ���  �޸��ϴ�.");
	}
	
	public void speedDown() {
		
		this.speed -=10;
		System.out.println("����  "+ this.speed + " �ӵ���  �޸��ϴ�.");
	}
	
	public void stop() {
		
		System.out.println("���� ����ϴ�.!!!"); 
	}
}

