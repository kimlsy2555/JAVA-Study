package example07;

public class UnsynchronizedEx {

	public static void main(String[] args) {
		// ���� ��ü ����
		Calculator calculator = new Calculator();
		
		// ������ ����? ��°���� ����, User-2 �����尡 ������ ������
		// User-1 �����嵵 �����Ѵ�.(�������� �ŷڼ� �ر�)
		// ����ȭ  ó���� �����ν� ��ü�� ����� �Ͼ�鼭 �������� �ŷڼ� Ȯ��
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		
		User2 user2=  new User2();
		user2.setCalculator(calculator);
		
		
		user2.start();
		
		

		
	
	
		
	}

}
