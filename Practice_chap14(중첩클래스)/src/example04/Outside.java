package example04;

public class Outside {

	//�ʵ弱��
	String str = "Outstide-field";
	
	// ��� �޼���
	public void method() {
		System.out.println("Outstide-method()ȣ��");
	}
	class Inner{
		
		// �ʵ� ����
		String str = "Inner-field";
		// ��� �޼���
		public void method() {
			System.out.println("Inner-method()ȣ��");
		}
		// ���⿡���� this�� InnerŬ������ this �̴�.
		public void showInfo() {
			//�ܺ� Ŭ������ ���ٹ��
			// �ܺ�Ŭ������.this.�ܺ�Ŭ���� ��� �̸� 
			// �ܺ�Ŭ������. ����̸��� ���� ��� ȣ�����̴�.
			
			System.out.println(this.str);
			this.method();
			
			// �ܺ� Ŭ������ �����ϴ� ���
			
			System.out.println(Outside.this.str);
			Outside.this.method();
		}
	}
	
	public void show() {
		
		System.out.println("=========================");
		// �ܺ�Ŭ���� ������ this �� �翬�� OutsideŬ������ ���Ѵ�.
		
		System.out.println(this.str);
		this.method();
		// �ܺ� Ŭ�������� ����Ŭ������ �����ҷ��� ������ �ʴ´�
		// �Ʒ��� ���� �ν��Ͻ��� �ϳ� �����ؼ� ��øŬ������  ����鿡�� ������ �ϸ�ȴ�.
		Inner in = new Inner();
		in.showInfo();
		
	}
}

