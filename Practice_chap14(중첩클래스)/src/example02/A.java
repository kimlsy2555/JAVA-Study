package example02;

public class A {
	A.B b = new A.B();
	A.C c = new A.C();

	public A(){
		System.out.println("==============================");
		System.out.println("�ܺ� Ŭ���� A�� ������ ȣ��");
		
		B b = new B(); // ������ ���� : �ν��Ͻ� ���Ŭ������ �ܺ� Ŭ���� A�� ��� �̴�.
		System.out.println(b.a);
		b.method1();
		
		C c =  new C();
		System.out.println(c.a);
		System.out.println(C.c);
		
		c.method1();
		C.method2();
		// D d= new D(); // �޼��� ���ο� ���� �Ǿ� �ֱ� ������ 
		this.method();
		System.out.println("==============================");
		
	}
	
	
	
	// �ν��Ͻ� ��� Ŭ����
	
	class B{
	
		int a = 10;
		public B(){
			
		System.out.println("��ø Ŭ���� B�� ������ ȣ��");
		
		} 
			
		 public void method1() {
			 
		 System.out.println("BŬ������ ��� �޼��� ȣ��");
		 
		}  
		 
	}
	static class C{
		int a = 20;
		static int c= 30;
				public C(){
					System.out.println("���� ���Ŭ���� C�� ������ ȣ��"); 
				}
		public void method1() {
			System.out.println("�������Ŭ���� C�� �޼��� 1 ȣ��");
		}
		public static void method2() {
			System.out.println("�������Ŭ���� C�� �޼��� 2 ȣ��");
		}
	}
	
	public void method() {
		// �޼��忡 ���� �ϱ����ؼ��� �ν��Ͻ��� �ʿ��ѵ� static�� �ٷ� �����ؾ��ϱ� ������
		// ����Ŭ���� �ȿ��� ����� static����� ���´�.
		class D{
			int a = 100;
			public D() {
				System.out.println("����Ŭ���� D�� ������ ȣ��"); 

			}
			public void lmetgod() {
				System.out.println(this.a); 
				System.out.println("����Ŭ���� D�� ��� �޼��� ȣ��");
			}
		}
		D d = new D();
		d.lmetgod();
	}
	//����Ŭ������ �޼��� ���ο����� ���� �� ����� �����ϴ�.
	
	
	
}
