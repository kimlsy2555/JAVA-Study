package example01;

public class MemberReferEx {

	int iv; // �ν��Ͻ�  ��� ����
	static int cv; // ���� ��� ����
	
	// �ν��Ͻ� �޼���
	// ����: �ν��Ͻ� �޼��尡 ȣ��� ���� �̹� �ν��Ͻ��� ���� �Ǿ� ���� ����.
	public void instanceMethod() {
		
		System.out.println(this.iv); 		  // �ν��Ͻ� ���� ��� ����
		System.out.println(MemberReferEx.cv); // ���� ������� ��밡��
		staticMethod();
	}
	public static void staticMethod() {
		//System.out.println(this.iv); 		  // �ν��Ͻ� ���� ���Ұ�
		System.out.println(cv); 			  // ���� ������� ��밡��
		//this.instanceMethod(); 				  // �ν��Ͻ� ��� �ż��� ��� �Ұ�
		
	}
}
