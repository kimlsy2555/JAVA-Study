package example03;

public class MonitorEx {

	public static void main(String[] args) {
		
		
		// ���������� �������� ���� ���̶�� ��������
		Monitor monitor = new Monitor();
		System.out.println(monitor.toString()); 
		monitor.channel = 5;
		monitor.power();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		
		System.out.println(monitor.toString()); 
		monitor.power();
		
		
		
	
		
		
	}	

}
