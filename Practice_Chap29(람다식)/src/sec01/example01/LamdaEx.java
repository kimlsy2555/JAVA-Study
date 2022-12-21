package sec01.example01;

public class LamdaEx {

	public static void main(String[] args) {
		 
		// ���ٽ��� �̿��ؼ� �͸�����ü�� �����ϰ� �ִ� ���̴�.
		// �Ű������� ������, ()�� ���� �Ұ��ΰ� �˰� �ִ�.
		// {} �� �߻�޼����� method()�� �����ΰ� ���� �ϸ�,
		// ���⼭ 2���̱� ������ {}�� �����Ҽ��� ����.
		
		Myinterface myinterface = () -> {
			String str = "���ٽ����� ���� �͸� ���� ��ü �Դϴ�.";
			System.out.println(str);
		};
		myinterface.method();
		
		Myinterface myinterface2 = new Myinterface() {
			
			@Override
			public void method() {
				
				String str = "���� �͸� ���� ��ü �Դϴ�.";
				System.out.println(str);
				
			}
		};
		myinterface2.method();
		
		
		myinterface = () ->{System.out.println("���ٽ����� ����1");};
		myinterface.method();
		
		System.out.println();
		
		// ���๮�� �ϳ��� ��� {}�� ���� �����ϴ�.
		myinterface = () ->System.out.println("���ٽ����� ����2");
		myinterface.method();
		
		System.out.println();
		
		// ��� : �͸��� ��ü�� �����ÿ� �ڵ��� �������� ���ٽ��� ����� ���� �ִ�.
		
	}
	
}
