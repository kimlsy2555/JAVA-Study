package example03;

public class A {
	
	// �ν��Ͻ� ��� Ŭ����
	 class B{
		 public B() {
			 System.out.println("�ν��Ͻ����Ŭ���� B ������");
		 }
	 
	 }
	 // ���� ��� Ŭ����
	 static class C{
		 public C() {
			 System.out.println("�������Ŭ���� C ������");
		 }
	 }
	 // �ν��Ͻ� ���(�ʵ�)
	 B b = new B();
	 A.C c = new C();
	 
	 
	 // �ν��Ͻ� ��� �޼���
	 // method1() �� ����� �� ����, �̹� �ܺ�Ŭ���� A�� 
	 // �ν��Ͻ��� ������� �����ϰ��̴�.
	 public void method1() {
		 System.out.println("method1()��");
		 B b = new B();
		A.C c = new C();
	 }
	 
	 // ���� ��� ����
	 
	 // static B b1 = new B(); class B�� �ν��Ͻ���� Ŭ�����̱⶧���� static�� ���ϼ� ����
	 static A.C c1 = new C();
	 
	 // static�� staticaks �����ϴ��ϴ�
	 public static void method2() {
		 
		 System.out.println("method2()��");
		 // B b = new B(); // �ν��ͽ� ��� Ŭ������ ���� �������� �𸣴� �����̱� ������ ���Ұ�
		  A.C c = new C(); // �����޼��� �̹Ƿ� ���� ���� ������ ������ �ص� �����ϴ�
	 }
	 
}
/////���/////
// ��øŬ�������� �ν��Ͻ� �ʵ峪 �޼���� �������� ���� ����������,
// �����ʵ峪 �����޼���� ���� Ŭ���������� ������ �����ϴ�.





