package example05;

public class Child extends Parent {

	int x = 20;
	
	public Child() {
		//super();	 
		// ����Ŭ������ �⺻ ������ ȣ�� ,�����ϴ��� �����Ϸ��� �˾Ƽ� 
		//�⺻������ �߰� 
		
		super(50);   // ����Ŭ������ �Ű������� �ִ� �����ڸ� ȣ��, ������ �� ������
		System.out.println("�ڼ�Ŭ���� ������ ȣ�� " );
	}
	@Override
	public void show() {
		
		System.out.println("���� �ν��Ͻ� x : "+x );
		System.out.println("�ڼ� Ŭ���� x : "+this.x );
		System.out.println("���� Ŭ���� x : "+super.x );
		super.show();
	}
}
