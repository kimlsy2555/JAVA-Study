package example05;

public class AnalogThemometer implements Thermometer.TemperatureChanger {

	int temperature = 100;
	@Override
	public void OnChange() {
		System.out.println("�Ƴ��α� �µ����Դϴ�.");  
		System.out.println(this.temperature+"�� �Դϴ�.");  
	}
}
