package example02;

public class Member {

	int iv = 100; // �ν��Ͻ� ��� ����
	static int cv = 200; // satic �⺭ ����
	
	// �ν��Ͻ� �޼���
	public void  imethod() {
		
		System.out.println("iv : "+ this.iv);
		//System.out.println("cv : "+Member.cv);
	}
	// staic �޼���
	public static void smethod() {
		// ���� �ν��Ͻ��� ����������� �ƹ��� �𸣱� �����̴�.
		
		//cv �� static �����̱� ������ �ν��Ͻ� �������̵� ���� �����ؾ���
		// static �޼��� �������� �󸶵��� ���� �����ϴ�
		//System.out.println("iv : ");
		 System.out.println("cv : "+ Member.cv);
	}
	
	
	
	
	
	
}
