package exercise;

public class Phone {
	
	private String name; // �̸� 
	private String address; // �ּ�
	private String telNum; //��ȭ��ȣ 
	
	public Phone(String name, String address,String telNum) {
		
		this.name = name;
		this.address= address;
		this.telNum = telNum;

	}

	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTelNum() {
		return telNum;
	}
	 
	@Override
	public String toString() {
	
		return     "�̸� : "+this.name
			    +"\n�ּ� : "+this.address+
			  "\n��ȭ��ȣ  :"+this.telNum;
	}
	
	
	
	
}
