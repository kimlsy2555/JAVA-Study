package example01;

class A{}
class B extends A{}
class C extends A{}

interface I{}

class D implements I{}
class E implements I{}

public class ClassCastEx {

	public static void main(String[] args) {
	
		// A a = new A();
		// ����Ŭ������ ���������� �����ϰ� �ִ� �ν��Ͻ��� Ÿ���� �����ΰ�??
		A a =new B();
		
		B b = (B)a;
		
		System.out.println("����Ϸ�");
		
		A a1 = new B();
		  a1 = new A();
		 C c =(C)a1; // ClassCastException �߻� 
		 System.out.println("����Ϸ�");
		
		I i = new D();
		D d = (D)i;
		
		System.out.println("����Ϸ�");
		
		// �������̽��� ���������� �����ϰ� �ִ� �ν��Ͻ��� Ÿ���� ������
		I i2 = new D();
		E e = (E)i2;
		
		System.out.println("����Ϸ�");
	}

}
