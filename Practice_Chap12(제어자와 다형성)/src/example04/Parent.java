package example04;

public class Parent {
	
	int x = 100;
	
	// �Ű������� Ÿ���� Object��� ���� ��� Ŭ������ �� �޾��ְڴٴ� ��.
	
	
	public void type(Object obj) {
		
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;
			System.out.println("����Ŭ���� ��� x : " + this.x);
		}
		else {
			System.out.println("��� ���谡 �մ� Ŭ������ �ƴմϴ�.");
		}
	}

	public void method() {
		
		System.out.println("���� �޼��� ȣ��"); 
	}
}
