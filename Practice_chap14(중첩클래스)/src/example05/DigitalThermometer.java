package example05;

// ��ø�������̽��� ������ Ŭ����
public class DigitalThermometer implements Thermometer.TemperatureChanger {

	int temperature = 50;
	@Override
	public void OnChange() {
		System.out.println("���� �µ��� �Դϴ�.");
		System.out.println(this.temperature+"�� �Դϴ�.");
		
	}
}
