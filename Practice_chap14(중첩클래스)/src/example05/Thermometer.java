package example05;

public class Thermometer {
	
	//��ø �������̽� ����
	interface TemperatureChanger{
		public void OnChange();
	}
	TemperatureChanger changer;
	
	
	// �Ű����� Ÿ���� �������̽� Ÿ���� ���Դ�. �̰��� ������ �ǹ��ϴ°ǰ���?
	// ��, TmpertureChangabe�������̽��� ������ Ŭ������ �� ���� �� �ִ�.
	// �������̽� �Ű������� ������
	
	public void setChanger(TemperatureChanger changer) {
		this.changer = changer;
	}
	public void viewTemperature() {
		this.changer.OnChange();
	}
	
	
}
