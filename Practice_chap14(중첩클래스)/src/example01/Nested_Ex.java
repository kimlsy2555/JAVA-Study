package example01;


public  class Nested_Ex {
	
	//�ν��Ͻ� ��� Ŭ����
	class A{
		
		
		int iv = 100;
		// static int cv = 200; // static ��������� ��� �Ұ� Nested_Ex.A.cv ������ �ȵȴ�.
		public A() {
			System.out.println("A ������ ȣ��");
		}
		public void method1() {
			System.out.println("AŬ������ method1() ȣ��");
		}
		// Nested_Ex.A.method2();
		//	public static void method2() {
		//System.out.println("AŬ������ method2() ȣ��");
		//}
	}
	
	
	//���� ��� Ŭ����
	
	static class B{
		
		int iv = 100;
		static int cv = 500; // Nested_Ex.B.cv ���� �����ϱ� ������ ���� �ȴ�.
		
		public B() {
			System.out.println("B ������ ȣ��");
		}
		
		public void method1() {
			System.out.println("BŬ������ method1() ȣ��");
		}
		// Nested_Ex.B.method2();
		public static void method2() {
			System.out.println("BŬ������ method2() ȣ��");
		}
	}
	public void method3() {
		// ����Ŭ���� ����� ���(�޼��� ���� �����Ͽ� , ��� ����� �뵵)
		class C{
			int iv = 200;
			//static cv = 700; // static��� ���� �Ұ� 
			public C() {
				System.out.println("����Ŭ���� C ������ ȣ��");
			}
			public void lmethod() {
				System.out.println("����Ŭ����C�޼��� ȣ��");
			}
		}
		//����Ŭ������ �ش� �޼��� �������� ����� �����ϴٴ� �Ϳ� �ָ�����.
		C c =new C();
		System.out.println(c.iv);
		c.lmethod();
	}
	
	public void method4() {
		// ����Ŭ���� ����� ���(�޼��� ���� �����Ͽ� , ��� ����� �뵵)
		class D{
			int iv = 250;
			//static cv = 700; // static��� ���� �Ұ� 
			public D() {
				System.out.println("����Ŭ���� D ������ ȣ��");
			}
			public void lmethod() {
				System.out.println("����Ŭ����D�޼��� ȣ��");
			}
		}
		//����Ŭ������ �ش� �޼��� �������� ����� �����ϴٴ� �Ϳ� �ָ�����.
		D d =new D();
		System.out.println(d.iv);
		d.lmethod();
	}
	
	
	public static void main(String[] args) {
		
		Nested_Ex ne =new Nested_Ex();
	
		// �ν��Ͻ� ��� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� �ݵ�� �־�� ���������ϴ�.
		Nested_Ex .A a = ne.new A();
		System.out.println(a.iv);
		a.method1();
		System.out.println("========================"); 
		
		
		// ���� Ŭ������ �ܺ�Ŭ������ �ν��Ͻ��� ��� ���� �����ϴ�.
		System.out.println(Nested_Ex.B.cv);
		Nested_Ex.B.method2();
		
		Nested_Ex.B b = new B();
		System.out.println(b.iv);
		b.method1();
		System.out.println("========================"); 
		
		ne.method3();
		ne.method4();

		// ���Ŭ������ ����Ŭ������ ���� ���� ���� �����ΰ�?
		// ����... ����Ŭ������ ������ �ٴ´�.
	}

}
