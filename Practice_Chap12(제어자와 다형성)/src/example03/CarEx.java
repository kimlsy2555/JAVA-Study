package example03;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sprotCar1 = new SportCar();
		SportCar sprotCar2 = null;
		PoliceCar policeCar = new PoliceCar();

		sprotCar1.speedUp();
		sprotCar1.drive();
		
		car = (Car)sprotCar1; //��ĳ���� ( �ڼ� -> ����), ���� ���� ��� �پ��
		// car.speed();  // ������ ���ܰ� �߻��ϴ� ���� : car�� speed()�޼��尡 ���⋚��
		sprotCar2 = (SportCar)car; // �ٿ� ĳ���� (���� -> �ڼ�) ���� ���� ��� �þ
		sprotCar2.speedUp();
		// ���� ��Ӱ��谡 �ƴϱ� ������ ����ȯ�� ���� �̷���ټ� ����
		// sprotCar1 = (SprotCar) policeCar; 
	}

}
