package ex;

import example01.Phone;

public class B extends Phone {
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B (String model, String color, String company) {
		super("ss","black","SAMSUNG");
	}
	// �̰� �ȵǴ� ������
	// �ٸ� ��Ű������ ��� �ȹް� ����ؼ��� ����
	Phone phone  = new Phone ("aa","black","SAMSONG"); 
	public void method() {
	System.out.println(this.model); 
	//System.out.println(phone.model); 
			
		}
	
}
