package example08;

public class ChildEx {

	public static void main(String[] args) {
		// �͸� �ڼհ�ü(�̸� X) --UI �̺�Ʈ ó���� ������ ��ü �������
		Parent parent = new Parent(){
			int b = 20;
			public void method1() {
				System.out.println("�͸��ڼ� ��ü �޼���");
			}
			@Override
			public void method() {
				
			 int a =10;
			 System.out.println("a : "+ a);
			 System.out.println(this.b);
			 this.method1();
			}
			
		};
	
		parent.method();
	
	
	}
	
	
}
