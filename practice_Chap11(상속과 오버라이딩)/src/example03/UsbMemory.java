package example03;

public class UsbMemory  extends HddDisk {

	int capacity;
	int rpm;
	
	public UsbMemory() {
		
	}

	public UsbMemory(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	// �����ε�
	public String Status(int i) {
		
		String str = "USB ��ũ �뷮 : "+ i + "\n"+
					 "USB �ӵ� : "+ this.rpm+"(rpm)";
	
	return str;
	}
	
	
	
	// ����Ŭ������ �޼��带 �������̵� ��
	@Override
	public String Status() {
	
		String str = "USB ��ũ �뷮 : "+ this.capacity + "\n"+
					 "USB �ӵ� : "+ this.rpm+"(rpm)";
	
	return str;
	}
	
	
}
