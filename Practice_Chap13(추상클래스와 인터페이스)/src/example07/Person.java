package example07;

public class Person implements MyInterface{
	@Override
	public void method() {
		System.out.println(MyInterface.MAX_NUM);
		System.out.println("MyInterface�� ������ PersonŬ������ �޼��� ȣ��");
	}
	
	// ����Ŭ���� �鿡�� ���� ������ ��ġ�� �ʰ�, ����Ʈ �޼��尡 �ʿ��� ���� Ŭ����������
	// �������̵��� �ؼ� ����ϸ� �ȴ�.
	@Override
	public void dmethod() {
		
		System.out.println("MyInterface�� ����Ʈ �޼��� �������̵��� �޼��� ȣ��");
	}

}
