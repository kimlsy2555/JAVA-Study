package sec01.example02;

public class LamdaEx {

	public static void main(String[] args) {
		 
		 Myinterface myinterface = null;
		 
		 myinterface = (x) ->{
			 int result = x *10;
			 System.out.println("�Ű����� x���� ������ ���ٽ��� ������ �޼����� �� : "+result);
		 };
		 // ���⼭ 500�� �Ű������̴�. �Ͽ� ���ٽ��� �Ű������� x�� ������ �Ǿ�����.
		 // 
		myinterface.method(500);
		
		// �Ű������� ()�� ������ �����ϴ�.
		myinterface = x ->
			
		System.out.println("�Ű����� x���� ������ ���ٽ��� ������ �޼����� �� : "+ ( x*10));
		myinterface.method(500);

		
	}
	
}
