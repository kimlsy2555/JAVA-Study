package example03;

public class Product {

	
	static int number = 0;
	int countNo;
	//���� �ʱ�ȭ ��(1���� �����)
	static {
		System.out.println("���� �ʱ�ȭ �� ȣ��� "); 
	}
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ���");
		++number;
		this.countNo = Product.number;
	}
	
	public Product() {
		System.out.println("�⺻ ������"); 
	}
	
	
	
}
