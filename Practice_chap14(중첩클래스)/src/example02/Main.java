package example02;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		
		// �ν��Ͻ� ��� Ŭ������ B�� �ݵ�� �ܺ� Ŭ���� A �� �ν��Ͻ��� �־��
		// ���� �����ϴ�.
		A.B b = a.new B();
		b.method1();
		
		System.out.println("==============================");
		
		System.out.println(A.C.c);
		A.C.method2();
		// ���� ��� Ŭ������ C�� �ܺ� Ŭ���� A�� �ν��Ͻ� �� �ִ� ���� �������
		// ���� �����ϴ�.
		A.C c = new A.C();
		System.out.println(c.a);
		c.method1();
		
		System.out.println("==============================");
		
		// �ܺ� Ŭ������ �ν��Ͻ��� �����ϸ� �󸶵� �޼��带 ȣ���Ͽ�
		// ����Ŭ������ �����Ͽ� ��� �� �� �ִ�.
		a.method();
		
		
	}

}
