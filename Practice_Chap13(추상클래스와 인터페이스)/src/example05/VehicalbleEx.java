package example05;

public class VehicalbleEx {

	public static void main(String[] args) {
	
		Driver drivar  = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-1);
		bus.setSpeed(80);
		// ���� ���������� �ѱ�¹�
		drivar.drive(bus);
		drivar.stop(bus);
		System.out.println();
		
		// ���� ���������� �ѱ�¹�
		taxi.setSpeed(-2);
		taxi.setSpeed(150);
		drivar.drive(taxi);
		drivar.stop(taxi);
		
		// ���� �Ű������� �����Ͽ� �ѱ�� ���
		System.out.println();
		drivar.drive(new Taxi());
		drivar.drive(new Bus());
		
		
		//drivar.drive(new AICar()); 
		// AICar �� Vehicalble�� �������� �ʾұ� ������
	
		System.out.println();
		
		// ����Ÿ�� ,�Ű�����Ÿ���� ��Ǫ  Vehicalble �������̽� Ÿ���̴�.
		// ����Ÿ�Ե� ����Ŭ������ �;� �ϸ� , �Ű����� Ÿ�Ե� ����
		// ���� Ŭ������ �;��Ѵ�.
		
		Vehicalble vehicalble = (Taxi)drivar.newCarmethod(new Taxi());
		vehicalble.run();
		vehicalble.stop();
		
		System.out.println();
		
		vehicalble = (Bus)drivar.newCarmethod(new Bus());
		vehicalble.run();
		vehicalble.stop();
		
		
	}

}
