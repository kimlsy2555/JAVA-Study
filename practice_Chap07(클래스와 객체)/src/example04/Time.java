package example04;

public class Time {

	// ���������� Access modifer �� ����
	// private ���� Ŭ���� �������� ���� ����
	// protected ���� ��Ű��, �ڼ�Ŭ���������� ���� ����
	// default ���� ��Ű�� ������ ���� ������
	// public ������ �� ���� ������
	
	
	// ���α׷����� �Ҷ�,  ��������� �����ϸ� private���� �����ڷ�
	// �����ְ� ,��  ��������� �ش��ϴ� getter()�� �������ִ�
	// ������� Ŭ������ �ۼ��ϴ� ����� �ùٸ���.
	private int hour;
	private	int minute;
	private	int second;
	
	
	
	//getter() ��� ������ ���� �о�� �޼���
	//setter() ��� ������ ���� �����ϴ� �޼���
	
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour >23)
			{
				System.out.println("�ð� ����");
				return;
			}
		this.hour = hour;
	}
	
	
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute >59)
		{
			System.out.println("�� ����");
			return;
		}
		this.minute = minute;
	}
	
	
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		if(second < 0 || second >59)
		{
			System.out.println("�� ����");
			return;
		}
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		
		return this.getHour()+ "�� "+this.getMinute()+"�� "
				   +this.getSecond()+"��";
	}
	
	
	
	
}
