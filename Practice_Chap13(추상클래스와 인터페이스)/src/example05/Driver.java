package example05;

public class Driver {

	// new Taxi() new Bus() �� ���ü� �ִ�.
	// �� 2���� Ŭ������ Vehicalble �������̽��� �����߱� ������
	
	//��������  �Ű������� ������ 
	public void drive(Vehicalble vehicalble) {
		vehicalble.run();
	//	System.out.println(vehicalble); // �ּ����
		
	}
	public void stop(Vehicalble vehicalble){
		vehicalble.stop();
	}
	
	public Vehicalble newCarmethod(Vehicalble vehicalble) {
		
		if(vehicalble instanceof Taxi) {
			
			System.out.println("�ý� ���� "); 
			Taxi taxi = (Taxi) vehicalble;
			System.out.println(vehicalble); 
			System.out.println(taxi); 
			return taxi;
		}
		
		else if(vehicalble instanceof Bus) {
			System.out.println("���� ���� "); 
			Bus bus = (Bus) vehicalble;
			System.out.println(vehicalble); 
			System.out.println(bus); 
		return bus;
		}
		
		return null;
	}
}
