package example04;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car(80);
		
		SportCar sportCar = new SportCar(150);

		car.speedUp();
		car.speedDown();
		car.stop();
		
		sportCar.speedUp();  // ���� Ŭ������ speedUP�� ȣ��
		sportCar.speedDown();// ���� Ŭ������ speedUP�� ȣ��
		sportCar.stop();	 // �ڼ� Ŭ������ stop() ȣ��
	}

}
