package example05;

public class Bus implements Vehicalble{
	
	private int speed;
	@Override
	public void run() {
		System.out.println("���� �� " + this.speed+"Km �޸��ϴ�");
	
	}
	@Override
	public void stop() {
		System.out.println("������  ����ϴ�.");
	
		
	}
	@Override
	public void setSpeed(int speed) {
		
		if(speed< 0 ) {
			System.out.println("�߸� �� �����Է�");
			return;
		}
		this.speed = speed;
	}
	

}
