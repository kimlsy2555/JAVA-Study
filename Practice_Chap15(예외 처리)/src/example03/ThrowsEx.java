package example03;

public class ThrowsEx {
	
	
	// JVM ���� ���ܸ� ������.
	public static void main(String[] args)  {
	
		// main() ���� method1() ȣ���ϰ� ������ ���⼭ ����ó���� �ؾ��Ѵ�.
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0 ���� ������ �����ϴ�.");
		}
		
		
	}
	// Throws �޼��� ����� ���� �ۼ��� �ϸ� ,
	// ȣ���� ������ ���ܸ� ������
	// ȣ���� ������ ���ܸ��ݵ�� ó���ؾ� �Ѵ�.
	public static void method1() throws Exception{
		method2();
		
	}
	
	public static void method2() throws Exception{
		System.out.println(10/0); // �������
	}
}
// mina �� throws Exception �ϸ�
// JVM�� �ش��ڵ��� �����ش�.
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at example03.ThrowsEx.method2(ThrowsEx.java:27)
//at example03.ThrowsEx.method1(ThrowsEx.java:22)
//at example03.ThrowsEx.main(ThrowsEx.java:9)