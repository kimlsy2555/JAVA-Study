package example07;

public interface MyInterface {

	int MAX_NUM = 100; // static final ���

	public void method(); //�߻� �޼��弱��(����)
	
	// JDK 1.8 ���� �߰��� ���
	default void dmethod() {
		System.out.println("MyInterface �� ����Ʈ �޼��� ȣ��");
		
	};
	static void smethod() {
		System.out.println("MyInterface �� �����޼��� ȣ��");
	}
}
