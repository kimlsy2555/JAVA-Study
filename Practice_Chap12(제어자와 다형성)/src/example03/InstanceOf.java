package example03;

public class InstanceOf {
	
	public static void main(String[] args) {
		// Ctrl + T �� ��Ӱ������� �� �� �ִ� ����Ű�̴�.
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar�� Ÿ�Ժ�ȯ ���� "); 
		}
		if(sportCar instanceof Car) {
			System.out.println("Car�� Ÿ�Ժ�ȯ ���� "); 
		}
		if(sportCar instanceof Object) {
			System.out.println("Object�� Ÿ�Ժ�ȯ ���� "); 
		}
		
		// instanceof �����ڃm ����� true ��� ���� ���� ����ȯ�� �����ϴٶ�°��� �ǹ��ϸ�
		// �ƿ��� ��Ӱ��迡 �ִ� ���̴�.
	
	
	
	
	
	
	
	
	
	}
}
