package example03;
// ���� �޼��� 
public class HddDisk {

	// �������
	
	int capacity; // �뷮
	int rpm;   	  // �ӵ�
	
	public HddDisk() {
		
	}
	// �Ű� ������ �ִ� ������
	public HddDisk(int capacity, int rpm) {
		
		this.capacity = capacity;
		this.rpm = rpm;
	}
	
	// HddDist �� ����� ���� �޼���
	public String Status() {
		
		String str = "�ϵ� ��ũ �뷮 : "+ this.capacity + "\n"+
					 "�ϵ� ��ũ �ӵ� : "+ this.rpm+"(rpm)";
		
		return str;
		
	}
	
	
}
