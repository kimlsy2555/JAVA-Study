package example05;

public class ThermometerEx {

	public static void main(String[] args) {
	
		Thermometer thermometer = new Thermometer();
		
		//AnalogThemometer A = new AnalogThemometer();
	
		//thermometer.setChanger(A);
		
		thermometer.setChanger(new AnalogThemometer());
		thermometer.viewTemperature();
		System.out.println();
		thermometer = new Thermometer();
		thermometer.setChanger(new DigitalThermometer());
		thermometer.viewTemperature();

	
	
	 // ��ø �������̽� �̹Ƿ� �͸� ���� ��ü�� ��� ���� �ȵȴ�
//		Thermometer.TemperatureChanger thermometer2 = new Thermometer.TemperatureChanger() {
//			
//			@Override
//			public void OnChange() {
//			
//				System.out.println(" �͸� ������ü");
//			}
//		};
		
		
		
	
	
	
	}
	

}
