package example05;

public class Taxi implements Vehicalble{
	
	private int speed;
	@Override
	public void run() {
		System.out.println("�ý� �� " + this.speed+"Km �޸��ϴ�");
	
	}
	@Override
	public void stop() {
		System.out.println("�ýð� ����ϴ�.");
	
		
	}
	@Override
	public void setSpeed(int speed) {
		
		if(speed< 0 ) {
			System.out.println("�߸� �� �����Է�");
			return;
		}
		this.speed =speed;
	}
	

}
