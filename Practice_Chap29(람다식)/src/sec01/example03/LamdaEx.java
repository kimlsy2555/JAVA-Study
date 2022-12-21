package sec01.example03;

public class LamdaEx {

	public static void main(String[] args) {
		 
		 Myinterface myinterface = null;
		 
		 myinterface = (x,y) ->{
			 int result = x+y;
			 return result;
		 };

		int result = myinterface.method(100,200);
		System.out.println("�Ű����� 2���� ���ϰ��� �ִ� ���ٽ� �� : "+result);

		myinterface = (x,y) ->  {return x+y;};
		
		result = myinterface.method(200,200);
		System.out.println("�Ű����� 2���� ���ϰ��� �ִ� ���ٽ� �� : "+result);
	
		// return �� �ϳ���� ���� �����ϴ�
		myinterface = (x,y) -> x+y;
		
		result = myinterface.method(1000,200);
		System.out.println("�Ű����� 2���� ���ϰ��� �ִ� ���ٽ� �� : "+result);
	
		// �޼��� ȣ��� �Ű�������  x,y �Ѿ��.
		myinterface = (x,y) -> add(x,y);
		
		result = myinterface.method(700,200);
		System.out.println("add�޼��� ȣ���� ���ٽ� �� : "+result);

	}
  

	public static int add(int x,int y) {
	return x+y;
	}
	
}
